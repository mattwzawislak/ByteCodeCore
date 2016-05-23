package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.objects.instruction.Instruction;
import org.obicere.bytecode.core.objects.label.CodeBlockLabel;
import org.obicere.bytecode.core.objects.label.EndLabel;
import org.obicere.bytecode.core.objects.label.Label;
import org.obicere.bytecode.core.objects.label.LabelFactory;
import org.obicere.bytecode.core.objects.label.OffsetLabel;
import org.obicere.bytecode.core.objects.label.StartLabel;
import org.obicere.bytecode.core.reader.instruction.InstructionReader;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Obicere
 */
public class CodeAttribute extends Attribute implements LabelFactory {

    public static final String IDENTIFIER = "CodeAttribute";

    private final int maxStack;

    private final int maxLocals;

    private final int codeSize;

    private final CodeException[] exceptions;

    private final AttributeSet attributeSet;

    private final TreeMap<Integer, CodeBlock> startPCToLine = new TreeMap<>();

    private final InstructionReader instructionReader;

    private boolean implicitLineNumberTable = true;

    public CodeAttribute(final int length, final int maxStack, final int maxLocals, final int codeSize, final byte[] code, final CodeException[] exceptions, final Attribute[] attributes, final InstructionReader instructionReader) {
        super(length);
        if (code == null) {
            throw new NullPointerException("code must be non-null");
        }
        if (exceptions == null) {
            throw new NullPointerException("exceptions must be non-null");
        }
        if (attributes == null) {
            throw new NullPointerException("attributes must be non-null");
        }
        this.maxStack = maxStack;
        this.maxLocals = maxLocals;
        this.codeSize = codeSize;
        this.exceptions = exceptions;
        this.attributeSet = new AttributeSet(attributes);
        this.instructionReader = instructionReader;

        buildBlocks(code);
        initializeLabels();
    }

    public int getMaxLocals() {
        return maxLocals;
    }

    public int getMaxStack() {
        return maxStack;
    }

    public CodeException[] getExceptions() {
        return exceptions;
    }

    public AttributeSet getAttributeSet() {
        return attributeSet;
    }

    public boolean hasImplicitLineNumberTable() {
        return implicitLineNumberTable;
    }

    public Iterable<CodeBlock> getBlocks() {
        return startPCToLine.values();
    }

    private void buildBlocks(final byte[] code) {
        final LineNumber[] lines = getLines();
        if (lines.length == 0) {
            final ImplicitCodeBlock block = new ImplicitCodeBlock();
            startPCToLine.put(0, block);
            implicitLineNumberTable = true;
        } else {
            for (final LineNumber line : lines) {
                final LineCodeBlock block = new LineCodeBlock(line);
                startPCToLine.put(line.getStartPC(), block);
            }
            implicitLineNumberTable = false;
        }

        boolean firstFrame = true; // first frame has different offset calc
        int lastOffset = 0; // header before the code attribute
        final StackMapFrame[] frames = getFrames();
        if (frames.length != 0) {
            implicitLineNumberTable = false;
            for (final StackMapFrame frame : frames) {
                lastOffset += frame.getOffsetDelta() + 1;
                if (firstFrame) {
                    lastOffset--;
                    firstFrame = false;
                }
                final FrameCodeBlock block = new FrameCodeBlock(frame, lastOffset);
                startPCToLine.put(block.getStartPC(), block);
            }

        }

        distributeInstructions(code, startPCToLine.values());
    }

    private List<CodeBlock> distributeInstructions(final byte[] code, final Iterable<CodeBlock> staggeredMap) {
        final Iterator<CodeBlock> iterator = staggeredMap.iterator();
        if (!iterator.hasNext()) {
            return new ArrayList<>();
        }
        final ArrayList<CodeBlock> blocks = new ArrayList<>();
        CodeBlock currentBlock = iterator.next();

        try {
            final IndexedDataInputStream codeReader = new IndexedDataInputStream(code);
            codeReader.setLabelFactory(this);

            while (iterator.hasNext() && codeReader.available() > 0) {
                final CodeBlock nextBlock = iterator.next();
                int start = currentBlock.getStartPC();
                final int endPC = nextBlock.getStartPC();

                final List<Instruction> lineInstructions = new LinkedList<>();

                while (start < endPC) {
                    final int startPC = codeReader.getIndex();
                    final Instruction next = instructionReader.read(codeReader);

                    lineInstructions.add(next);

                    start += codeReader.getIndex() - startPC;
                }

                final Instruction[] instructions = new Instruction[lineInstructions.size()];
                currentBlock.setInstructions(lineInstructions.toArray(instructions));

                currentBlock = nextBlock;
                blocks.add(currentBlock);
            }

            // dump the remaining instructions into last line
            final List<Instruction> lineInstructions = new LinkedList<>();
            while (codeReader.available() > 0) {
                final Instruction next = instructionReader.read(codeReader);
                lineInstructions.add(next);
            }
            final Instruction[] instructions = new Instruction[lineInstructions.size()];
            currentBlock.setInstructions(lineInstructions.toArray(instructions));

            blocks.add(currentBlock);
        } catch (final IOException e) {
            Logger.getGlobal().log(Level.SEVERE, "Error while building code blocks", e);
            return null;
        }
        return blocks;
    }

    private StackMapFrame[] getFrames() {
        final StackMapTableAttribute stackMapTableAttribute = attributeSet.getAttribute(StackMapTableAttribute.class);
        if (stackMapTableAttribute != null) {
            return stackMapTableAttribute.getEntries();
        } else {
            return new StackMapFrame[0];
        }
    }

    private LineNumber[] getLines() {
        final Set<LineNumberTableAttribute> lineNumberTables = attributeSet.getAttributes(LineNumberTableAttribute.class);
        if (lineNumberTables == null) {
            return new LineNumber[0];
        }
        final List<LineNumber> lines = new ArrayList<>();
        for (final LineNumberTableAttribute lineNumberTable : lineNumberTables) {
            Collections.addAll(lines, lineNumberTable.getLineNumberTable());
        }
        return lines.toArray(new LineNumber[lines.size()]);
    }

    private void initializeLabels() {
        for (final CodeException exception : exceptions) {
            exception.initializeLabels(this);
        }

        final Set<LocalVariableTableAttribute> localVars = attributeSet.getAttributes(LocalVariableTableAttribute.class);
        final Set<LocalVariableTypeTableAttribute> localVarTypes = attributeSet.getAttributes(LocalVariableTypeTableAttribute.class);

        for (final LocalVariableTableAttribute localVar : localVars) {
            localVar.initializeLabels(this);
        }
        for (final LocalVariableTypeTableAttribute localVarType : localVarTypes) {
            localVarType.initializeLabels(this);
        }
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public int getIndexOf(final CodeBlock block) {
        if (block == null) {
            return 0;
        }
        for (final Map.Entry<Integer, CodeBlock> entry : startPCToLine.entrySet()) {
            final CodeBlock next = entry.getValue();
            if (block.equals(next)) {
                return entry.getKey();
            }
        }
        return -1;
    }

    @Override
    public Label getLabel(final int pc, final int offset) {
        final int offsetPC = pc + offset;
        if (offsetPC > codeSize) {
            return null;
        }
        if (offsetPC == codeSize) {
            return new EndLabel();
        }
        if (offsetPC == 0) {
            return new StartLabel();
        }
        if (implicitLineNumberTable) {
            return new CodeBlockLabel(null, offsetPC);
        } else {
            final Map.Entry<Integer, CodeBlock> entry = startPCToLine.floorEntry(offsetPC);

            if (entry == null) {
                // shouldn't happen?!
                return null;
            }

            final int offsetFromBlock = offsetPC - entry.getKey();
            final CodeBlock block = entry.getValue();

            if (block == null) {
                return null;
            }

            return new CodeBlockLabel(block, offsetFromBlock);
        }
    }

    @Override
    public Label getOffsetLabel(final int offset) {
        return new OffsetLabel(offset);
    }

    @Override
    public int getCodeSize() {
        return codeSize;
    }
}
