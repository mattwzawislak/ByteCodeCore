package org.obicere.bytecode.core.objects.code;

import org.javacore.Identifier;
import org.javacore.attribute.Attribute;
import org.javacore.attribute.AttributeSet;
import org.javacore.attribute.LineNumberTableAttribute;
import org.javacore.attribute.LocalVariableTableAttribute;
import org.javacore.attribute.LocalVariableTypeTableAttribute;
import org.javacore.attribute.StackMapTableAttribute;
import org.javacore.code.Code;
import org.javacore.code.LineNumber;
import org.javacore.code.LocalVariable;
import org.javacore.code.block.CodeBlock;
import org.javacore.code.block.FrameCodeBlock;
import org.javacore.code.block.LineCodeBlock;
import org.javacore.code.block.label.Label;
import org.javacore.code.frame.StackMapFrame;
import org.javacore.code.instruction.Instruction;
import org.javacore.code.table.CodeBlockTable;
import org.javacore.code.table.CodeExceptionTable;
import org.javacore.code.table.LocalVariableTable;
import org.obicere.bytecode.core.objects.code.block.DefaultFrameCodeBlock;
import org.obicere.bytecode.core.objects.code.block.DefaultLineCodeBlock;
import org.obicere.bytecode.core.objects.code.block.label.DefaultLabel;
import org.obicere.bytecode.core.objects.code.table.DefaultCodeBlockTable;
import org.obicere.bytecode.core.objects.code.table.DefaultLocalVariableTable;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 */
public class DefaultCode implements Code {

    private static final Instruction[] EMPTY = new Instruction[0];

    private static final int MAX_CODE_SIZE = 65536;

    private int maxStack;
    private int maxLocals;

    private CodeBlockTable codeBlocks;

    private CodeExceptionTable exceptions;

    private LocalVariableTable variables;

    private final Label start = new StartLabel();

    private final Label end = new EndLabel();

    private int size = 0;

    private Instruction[] instructions = EMPTY;

    private short[] pcValues = new short[]{0};

    // pc->Label map

    private short[] pcKeys;

    private Label[] labels;

    public DefaultCode(final ByteCodeReader reader) throws IOException {
        reader.enterParent(this);
        // read name and discard
        reader.readShort();
        // read name and discard
        reader.readInt();

        this.maxStack = reader.readUnsignedShort();
        this.maxLocals = reader.readUnsignedShort();

        final int expectedSize = reader.readInt();
        final Instruction[] instructions = readInstructions(reader, expectedSize);
        insert(instructions);

        this.exceptions = reader.read(Identifier.CODE_EXCEPTION_TABLE);

        final AttributeSet attributes = reader.readAttributeSet();
        this.codeBlocks = createCodeBlockTable(attributes);
        this.variables = createLocalVariableTable(attributes);

        reader.exitParent(this);
    }

    protected Instruction[] readInstructions(final ByteCodeReader reader, final int expectedSize) throws IOException {
        int current = 0;
        final List<Instruction> instructions = new LinkedList<>();
        while (current < expectedSize) {
            final Instruction instruction = reader.read(Identifier.INSTRUCTION);

            current += instruction.getLength(current);

            instructions.add(instruction);
        }
        if (current != expectedSize) {
            throw new AssertionError("");
        }

        return instructions.toArray(new Instruction[instructions.size()]);
    }

    @Override
    public int getMaxLocals() {
        return maxStack;
    }

    @Override
    public int getMaxStack() {
        return maxLocals;
    }

    @Override
    public CodeBlockTable getCodeBlockTable() {
        return codeBlocks;
    }

    @Override
    public CodeExceptionTable getCodeExceptionTable() {
        return exceptions;
    }

    @Override
    public LocalVariableTable getLocalVariableTable() {
        return variables;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Instruction[] getInstructions() {
        return instructions.clone();
    }

    @Override
    public Instruction[] getInstructions(final int start, final int end) {
        return Arrays.copyOfRange(instructions, start, end);
    }

    public Label getLabel(final int pc) {
        return getLabel(pc, true);
    }

    public Label getLabel(final int pc, final boolean special) {
        if (special) {
            if (pc == 0) {
                return start;
            } else if (pc == size) {
                return end;
            }
        }
        if (pc < 0 || pc > size) {
            throw new IndexOutOfBoundsException("pc value out of bounds: " + pc);
        }
        final int floorIndex = floorPcIndex(pcValues, (short) pc);
        final short floorPc = pcValues[floorIndex];

        // assert pcIndex = floorPcIndex(pcKeys, floorPc);
        final int pcIndex = pcIndex(pcKeys, floorPc);
        if (pcIndex > 0) {
            // we have an existing label
            return labels[pcIndex];
        }
        final Label newLabel = createLabel(pcValues[floorIndex]);
        insertLabel(newLabel);
        return newLabel;
    }

    private void insertLabel(final Label label) {
        final int pc = label.getAddress();

        final int index = maxPcIndex(pcKeys, (short) pc) - 1;

        this.pcKeys = Arrays.copyOf(pcKeys, pcKeys.length + 1);
        this.labels = Arrays.copyOf(labels, labels.length + 1);

        final int shift = pcKeys.length - index - 1;

        System.arraycopy(pcKeys, index, pcKeys, index + 1, shift);
        System.arraycopy(labels, index, labels, index + 1, shift);

        pcKeys[index] = (short) pc;
        labels[index] = label;
    }

    private void insertLabels(final Label[] labels) {
        // TODO fix this so that it is more optimal for multiple insertions
        for (final Label label : labels) {
            insertLabel(label);
        }
    }

    /*
    Give a code segment of:

    L0:
       a
    L1:
       b
    L2:
       c

    With the op:

    insert(L1, {e1, e2, e3})

    Insert before | Insert after (false) | Insert after (true)
    --------------+----------------------+--------------------
    L0:           | L0:                  | L0:
       a          |    a                 |    a
       e1         | L1:                  | L1:
       e2         |    e1                |    e1
       e3         | L2:                  |    e2
    L1:           |    e2                |    e3
       b          |    e3                |    b
    L2:           |    b                 | L2:
       c          |    c                 |    c
    --------------+----------------------+--------------------

     */

    @Override
    public boolean insert(final Instruction[] instructions) {
        return insertInstructions(size, instructions, 0, instructions.length, true, false);
    }

    @Override
    public boolean insertBefore(final int pc, final Instruction[] instructions) {
        return insertInstructions(pc, instructions, 0, instructions.length, true, true);
    }

    @Override
    public boolean insertBefore(final int pc, final Instruction[] instructions, final int start, final int length) {
        return insertInstructions(pc, instructions, start, length, true, true);
    }

    @Override
    public boolean insert(final int pc, final Instruction[] instructions) {
        return insertInstructions(pc, instructions, 0, instructions.length, true, false);
    }

    @Override
    public boolean insert(final int pc, final Instruction[] instructions, final int start, final int length) {
        return insertInstructions(pc, instructions, start, length, true, false);
    }

    @Override
    public boolean insert(final int pc, final Instruction[] instructions, final boolean updateLabels) {
        return insertInstructions(pc, instructions, 0, instructions.length, updateLabels, false);
    }

    @Override
    public boolean insert(final int pc, final Instruction[] instructions, final int start, final int length, final boolean updateLabels) {
        return insertInstructions(pc, instructions, start, length, updateLabels, false);
    }

    @Override
    public Instruction[] remove(final int start, final int length) {
        return removeInstructions(start, length);
    }

    @Override
    public Instruction[] removeAll() {
        return removeInstructions(0, size);
    }

    @Override
    public Attribute[] getAttributes() {
        // TODO recreate the attributes
        return new Attribute[0];
    }

    private Instruction[] removeInstructions(final int start, final int end) {
        if (start < 0 || start > size) {
            throw new IndexOutOfBoundsException("pc value out of bounds: " + start);
        }
        if (end < start || end > size) {
            throw new IllegalArgumentException("pc values out of bounds: " + end);
        }
        if (start == size || start == end) {
            return EMPTY;
        }
        final int startIndex = floorPcIndex(pcValues, (short) start);
        final int endIndex = floorPcIndex(pcValues, (short) start);
        if (startIndex == endIndex) {
            // should we just remove the one instruction?
            // i don't know
            return EMPTY;
        }
        final short startPc = pcValues[startIndex];
        final short endPc = pcValues[endIndex];

        final int removalSize = u2sub(endPc, startPc);

        final int length = endIndex - startIndex;
        final int newLength = instructions.length - length;

        final Instruction[] removed = new Instruction[length];

        System.arraycopy(instructions, startIndex - length, removed, 0, length);
        System.arraycopy(instructions, startIndex, instructions, startIndex - length, length);
        System.arraycopy(pcValues, startIndex, pcValues, startIndex - length, length);

        this.instructions = Arrays.copyOf(instructions, instructions.length - newLength);
        this.pcValues = Arrays.copyOf(pcValues, pcValues.length - newLength + 1);

        size -= removalSize;

        shiftLabelsRemove(startPc, endPc, removalSize);

        return removed;
    }

    private boolean insertInstructions(final int pc, final Instruction[] newInstructions, final int start, final int length, final boolean updateLabels, final boolean updateCurrent) {
        if (pc < 0 || pc > size) {
            throw new IndexOutOfBoundsException("pc value out of bounds: " + pc);
        }
        if (newInstructions == null) {
            throw new NullPointerException("instructions must be non-null");
        }
        if (newInstructions.length > MAX_CODE_SIZE) {
            throw new IllegalArgumentException("Attempting to add too many instructions");
        }
        // instead of ensuring each instruction is non-null, we can relay
        // on later calls to do it.

        if (start < 0 || start >= newInstructions.length) {
            throw new IndexOutOfBoundsException("start value out of bounds: " + start);
        }
        if (length < 0 || start + length > newInstructions.length) {
            throw new IllegalArgumentException("Illegal length value: " + length);
        }
        if (length == 0) {
            // technically it worked... right??
            return true;
        }
        final int insertionIndex = floorPcIndex(pcValues, (short) pc);
        final short insertionPC = pcValues[insertionIndex];
        // grow array
        grow(length);
        // perform insertion
        // the number of elements in the old array that have to be shifted
        // to the right
        // for better understanding, this is equal to:
        //     oldInstructions.length - insertionIndex;
        final int shift = instructions.length - length - insertionIndex;
        // createPcs will throw a NullPointerException for a null instruction
        final short[] newPcs = createPcs(newInstructions, start, length, insertionPC);
        final int insertionSize = u2sub(newPcs[length], newPcs[0]);
        final int offset = insertionIndex + length;

        // ensure size update doesn't overflow available size
        if (size + insertionSize > MAX_CODE_SIZE) {
            throw new IllegalStateException("Code size has exceeded maximum size");
        }

        // shift over the instructions
        System.arraycopy(instructions, insertionIndex, instructions, offset, shift);
        // insert new instructions
        System.arraycopy(newInstructions, start, instructions, insertionIndex, length);

        // we have to modify the array anyhow, to update pc values
        // we might as well do it in one sweep
        System.arraycopy(pcValues, insertionIndex, pcValues, offset, shift + 1);

        // + 1 since the pcValues array has 1 extra element than the
        // instructions array
        for (int i = 0; i < shift + 1; i++) {
            pcValues[offset + i] += insertionSize;
        }

        // insert new pc values
        System.arraycopy(newPcs, start, pcValues, insertionIndex, length);

        // update labels
        shiftLabelsInsert(pc, updateCurrent, updateLabels, insertionSize);
        // update size
        size += insertionSize;
        return true;
    }

    private short[] createPcs(final Instruction[] instructions, final int start, final int length, final short pc) {
        short current = pc;
        final short[] pcValues = new short[length + 1];

        for (int i = 0; i < length; i++) {
            pcValues[i] = current;

            current += instructions[start + i].getLength(pc);
        }
        pcValues[length] = current;
        return pcValues;
    }

    private int minPcIndex(final short[] pcs, final short pc) {
        int index = floorPcIndex(pcs, pc);
        while (index > 0) {
            if (pcs[index - 1] != pcs[index]) {
                break;
            }
            index--;
        }
        return index;
    }

    private int maxPcIndex(final short[] pcs, final short pc) {
        int index = floorPcIndex(pcs, pc);
        index++;
        while (index < pcs.length) {
            if (pcs[index - 1] != pcs[index]) {
                break;
            }
            index++;
        }
        return index;
    }

    private int floorPcIndex(final short[] pcs, final short pc) {
        final int search = pcIndex(pcs, pc);
        return search < 0 ? ~search - 1 : search;
    }

    private int ceilPcIndex(final short[] pcs, final short pc) {
        final int search = pcIndex(pcs, pc);
        return search < 0 ? ~search : search;
    }

    private int pcIndex(final short[] pcs, final short pc) {
        if (pcs.length == 0) {
            return -1;
        }
        // copied from the Arrays binary search methods, but modified
        int low = 0;
        int high = pcs.length - 1;
        while (low <= high) {
            final int mid = (low + high) / 2;
            final int cmp = u2cmp(pcs[mid], pc);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return ~low;
    }

    private int u2cmp(final short a, final short b) {
        return Integer.compareUnsigned(a, b);
    }

    private int u2sub(final short a, final short b) {
        return (0xFFFF & a) - (0xFFFF & b);
    }

    private void grow(final int count) {
        final int n = count + instructions.length;
        if (n > MAX_CODE_SIZE) {
            throw new IllegalArgumentException("Cannot allocate additional space for array.");
        }
        this.pcValues = Arrays.copyOf(pcValues, n + 1);
        this.instructions = Arrays.copyOf(instructions, n);
    }

    private void shiftLabelsInsert(final int pc, final boolean updateCurrent, final boolean updateLabels, final int shift) {
        if (labels.length == 0) {
            return;
        }
        final int startIndex;
        if (updateCurrent) {
            startIndex = minPcIndex(pcKeys, (short) pc);
        } else {
            startIndex = maxPcIndex(pcKeys, (short) pc);
        }
        for (int i = startIndex; i < pcKeys.length; i++) {
            final Label label = labels[i];
            final short address;

            if (updateLabels) {
                address = (short) (label.getAddress() + shift);
            } else {
                final int currentAddress = label.getAddress();
                final short minimum = (short) Math.min(currentAddress, size);
                final int ceilIndex = ceilPcIndex(pcValues, minimum);
                address = pcValues[ceilIndex];
            }

            // contract!
            // pcKeys[label] = label.getAddress()
            // though, technically I break that with the `end`
            // label construct. However its easier than handling
            // the `updateLabels=false` case, where `end` would
            // have to be updated anyway
            label.setAddress(address);
            pcKeys[i] = address;
        }
    }

    private void shiftLabelsRemove(final int start, final int end, final int shift) {
        if (labels.length == 0) {
            return;
        }
        final int minPcIndex = minPcIndex(pcValues, (short) start);
        final short minPc = pcValues[minPcIndex];
        final int startIndex = minPcIndex(pcKeys, (short) start);
        final int endIndex = ceilPcIndex(pcKeys, (short) end);

        int i = 0;
        for (i = startIndex; i < endIndex; i++) {
            final Label label = labels[i];

            label.setAddress(minPc);
            pcKeys[i] = minPc;
        }
        for (; i < labels.length; i++) {
            final Label label = labels[i];

            final short newAddress = (short) (label.getAddress() - shift);

            label.setAddress(newAddress);
            pcKeys[i] = newAddress;
        }
    }

    protected CodeBlockTable createCodeBlockTable(final AttributeSet attributes) {

        final LineNumber[] lines = getLines(attributes);
        final StackMapFrame[] frames = getFrames(attributes);

        return initializeCodeBlockTable(lines, frames);
    }

    protected StackMapFrame[] getFrames(final AttributeSet attributes) {
        final StackMapTableAttribute stackMapTableAttribute = attributes.getAttribute(StackMapTableAttribute.class);
        if (stackMapTableAttribute != null) {
            return stackMapTableAttribute.getEntries();
        } else {
            return new StackMapFrame[0];
        }
    }

    protected LineNumber[] getLines(final AttributeSet attributes) {
        final Set<LineNumberTableAttribute> lineNumberTables = attributes.getAttributes(LineNumberTableAttribute.class);
        if (lineNumberTables == null) {
            return new LineNumber[0];
        }
        final List<LineNumber> lines = new ArrayList<>();
        for (final LineNumberTableAttribute lineNumberTable : lineNumberTables) {
            Collections.addAll(lines, lineNumberTable.getTable());
        }
        return lines.toArray(new LineNumber[lines.size()]);
    }

    protected CodeBlockTable initializeCodeBlockTable(final LineNumber[] lines, final StackMapFrame[] frames) {
        final Map<Integer, CodeBlock> indices = new TreeMap<>();

        for (final LineNumber line : lines) {
            final int pc = line.getAddress().getAddress();
            final LineCodeBlock block = createLineCodeBlock(line);
            indices.put(pc, block);
        }

        int lastOffset = 0;
        for (int i = 0; i < frames.length; i++) {
            final StackMapFrame frame = frames[i];
            if (i != 0) {
                lastOffset++;
            }
            lastOffset += frame.getOffsetDelta();

            final Label label = getLabel(lastOffset);
            final FrameCodeBlock block = createFrameCodeBlock(frame, label);
            indices.put(lastOffset, block);
        }

        final Collection<CodeBlock> values = indices.values();
        final CodeBlock[] blocks = values.toArray(new CodeBlock[values.size()]);

        return createCodeBlockTable(blocks);
    }

    protected LocalVariableTable createLocalVariableTable(final AttributeSet attributes) {
        final Set<LocalVariable> variables = new LinkedHashSet<>();

        final Set<LocalVariableTypeTableAttribute> localVariableTypeTableAttributes = attributes.getAttributes(LocalVariableTypeTableAttribute.class);

        if (localVariableTypeTableAttributes != null) {
            for (final LocalVariableTypeTableAttribute localVariableTypeTableAttribute : localVariableTypeTableAttributes) {
                final LocalVariable[] table = localVariableTypeTableAttribute.getTable();
                for (final LocalVariable type : table) {
                    variables.add(type);
                }
            }
        }

        final Set<LocalVariableTableAttribute> localVariableTableAttributes = attributes.getAttributes(LocalVariableTableAttribute.class);

        if (localVariableTableAttributes != null) {
            for (final LocalVariableTableAttribute localVariableTableAttribute : localVariableTableAttributes) {
                final LocalVariable[] table = localVariableTableAttribute.getTable();
                for (final LocalVariable type : table) {
                    if (!variables.contains(type)) {
                        variables.add(type);
                    }
                }
            }
        }
        return createLocalVariableTable(new LocalVariable[variables.size()]);
    }

    // type constructors

    protected Label createLabel(final int pc) {
        return new DefaultLabel(this, pc);
    }

    protected LineCodeBlock createLineCodeBlock(final LineNumber line) {
        return new DefaultLineCodeBlock(line);
    }

    protected FrameCodeBlock createFrameCodeBlock(final StackMapFrame frame, final Label label) {
        return new DefaultFrameCodeBlock(frame, label);
    }

    protected CodeBlockTable createCodeBlockTable(final CodeBlock[] codeBlocks) {
        return new DefaultCodeBlockTable(codeBlocks);
    }

    protected LocalVariableTable createLocalVariableTable(final LocalVariable[] variables) {
        return new DefaultLocalVariableTable(variables);
    }

    private class StartLabel implements Label {

        @Override
        public String getName() {
            return "start";
        }

        @Override
        public Code getCode() {
            return DefaultCode.this;
        }

        @Override
        public int getAddress() {
            return 0;
        }

        @Override
        public void setAddress(final int address) {
        }
    }

    private final class EndLabel implements Label {

        @Override
        public String getName() {
            return "end";
        }

        @Override
        public Code getCode() {
            return DefaultCode.this;
        }

        @Override
        public int getAddress() {
            return size;
        }

        @Override
        public void setAddress(final int address) {
        }
    }
}
