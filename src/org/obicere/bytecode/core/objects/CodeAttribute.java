package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.objects.instruction.Instruction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Obicere
 */
public class CodeAttribute extends Attribute {

    public static final String IDENTIFIER = "CodeAttribute";

    private final int maxStack;

    private final int maxLocals;

    private final byte[] code;

    private final Instruction[] instructions;

    private final CodeException[] exceptions;

    private final Attribute[] attributes;

    private final AttributeSet attributeSet;

    private final Map<Integer, CodeBlock> startPCToLine = new TreeMap<>();

    public CodeAttribute(final int length, final int maxStack, final int maxLocals, final byte[] code, final Instruction[] instructions, final CodeException[] exceptions, final Attribute[] attributes) {
        super(length);
        this.maxStack = maxStack;
        this.maxLocals = maxLocals;
        this.code = code;
        this.instructions = instructions;
        this.exceptions = exceptions;
        this.attributes = attributes;
        this.attributeSet = new AttributeSet(attributes);

        buildBlocks();
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

    public byte[] getCode() {
        return code;
    }

    public Instruction[] getInstructions() {
        return instructions;
    }

    public Attribute[] getAttributes() {
        return attributes;
    }

    public AttributeSet getAttributeSet() {
        return attributeSet;
    }

    public String getBlockName(final int startPC) {
        return getBlockName(startPC, 14);
    }

    public String getBlockName(final int startPC, final int offset) {
        // could use a nicer way to get the code offset. By summing the
        // offsets from the start of the attribute we get this:
        // u2 + u4 + u2 + u2 + u4 = 14 bytes of information before code.
        // We then have to subtract this, as instructions include
        // the 14 bytes in their offset values
        final int pc = startPC + offset - 14;
        final int searchPC = pc - getStart();
        if (searchPC == code.length) {
            return "end";
        }

        CodeBlock block = startPCToLine.get(searchPC);

        if (block != null) {
            return block.getName();
        }

        // if the block is null, find the best fit
        int closest = Integer.MAX_VALUE;
        for (final CodeBlock nearest : startPCToLine.values()) {
            final int delta = searchPC - nearest.getStartPC();
            if (delta >= 0 && delta < closest) {
                closest = delta;
                block = nearest;
            }
        }

        // if the best fit is null, then wtf happened here
        if (block == null) {
            return "?";
        } else {
            // include the offset
            return block.getName() + "+" + closest;
        }
    }

    public Iterable<CodeBlock> getBlocks() {
        return startPCToLine.values();
    }

    private void buildBlocks() {
        final LineNumber[] lines = getLines();
        for (final LineNumber line : lines) {
            final LineCodeBlock block = new LineCodeBlock(line);
            startPCToLine.put(line.getStartPC(), block);
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

        distributeInstructions(startPCToLine.values());
    }

    private List<CodeBlock> distributeInstructions(final Iterable<CodeBlock> staggeredMap) {
        final Iterator<CodeBlock> iterator = staggeredMap.iterator();
        if (!iterator.hasNext()) {
            return new ArrayList<>();
        }
        final ArrayList<CodeBlock> blocks = new ArrayList<>();
        int instruction = 0;
        CodeBlock currentBlock = iterator.next();

        while (iterator.hasNext()) {
            final CodeBlock nextBlock = iterator.next();
            int start = currentBlock.getStartPC();
            final int endPC = nextBlock.getStartPC();

            final List<Instruction> lineInstructions = currentBlock.getInstructions();

            while (start < endPC) {
                final Instruction next = instructions[instruction++];

                lineInstructions.add(next);

                start += next.getLength();
            }
            currentBlock = nextBlock;
            blocks.add(currentBlock);
        }

        // dump the remaining instructions into last line
        final List<Instruction> list = currentBlock.getInstructions();
        while (instruction < instructions.length) {
            list.add(instructions[instruction++]);
        }
        blocks.add(currentBlock);
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
