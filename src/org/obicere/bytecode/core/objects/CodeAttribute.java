package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.objects.instruction.Instruction;
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
public class CodeAttribute extends Attribute {

    public static final String IDENTIFIER = "CodeAttribute";

    private final int maxStack;

    private final int maxLocals;

    private final int codeSize;

    private final CodeException[] exceptions;

    private final AttributeSet attributeSet;

    private final TreeMap<Integer, CodeBlock> startPCToLine = new TreeMap<>();

    private final InstructionReader instructionReader;

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

    public int getCodeSize() {
        return codeSize;
    }

    public AttributeSet getAttributeSet() {
        return attributeSet;
    }

    public String getBlockName(final int startPC) {
        return getBlockName(startPC, 0);
    }

    public String getBlockName(final int startPC, final int offset) {
        final int pc = startPC + offset;
        if (pc == codeSize) {
            return "end";
        }

        Map.Entry<Integer, CodeBlock> closest = startPCToLine.floorEntry(pc);

        if (closest == null) {
            return null;
        }

        final CodeBlock block = closest.getValue();
        final int delta = pc - closest.getKey();

        if (delta == 0) {
            return block.getName();
        } else if (block instanceof ImplicitCodeBlock) {
            // implicit start pc = 0
            // so this is the offset from the start
            // this should always be positive
            return String.valueOf(delta);
        } else {
            return block.getName() + "+" + delta;
        }
    }

    public Iterable<CodeBlock> getBlocks() {
        return startPCToLine.values();
    }

    private void buildBlocks(final byte[] code) {
        final LineNumber[] lines = getLines();
        if (lines.length == 0) {
            final ImplicitCodeBlock block = new ImplicitCodeBlock();
            startPCToLine.put(0, block);
        } else {
            for (final LineNumber line : lines) {
                final LineCodeBlock block = new LineCodeBlock(line);
                startPCToLine.put(line.getStartPC(), block);
            }
        }

        boolean firstFrame = true; // first frame has different offset calc
        int lastOffset = 0; // header before the code attribute
        final StackMapFrame[] frames = getFrames();
        for (final StackMapFrame frame : frames) {
            lastOffset += frame.getOffsetDelta() + 1;
            if (firstFrame) {
                lastOffset--;
                firstFrame = false;
            }
            final FrameCodeBlock block = new FrameCodeBlock(frame, lastOffset);
            startPCToLine.put(block.getStartPC(), block);
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

            while (iterator.hasNext() && codeReader.available() > 0) {
                final CodeBlock nextBlock = iterator.next();
                int start = currentBlock.getStartPC();
                final int endPC = nextBlock.getStartPC();

                final List<Instruction> lineInstructions = new LinkedList<>();

                while (start < endPC) {
                    final Instruction next = instructionReader.read(codeReader);

                    lineInstructions.add(next);

                    start += next.getLength();
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

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
