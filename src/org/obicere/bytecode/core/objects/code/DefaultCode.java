package org.obicere.bytecode.core.objects.code;

import org.javacore.code.Code;
import org.javacore.code.instruction.Instruction;
import org.javacore.code.table.CodeBlockTable;
import org.javacore.code.table.CodeExceptionTable;
import org.javacore.code.table.LocalVariableTable;

/**
 */
public class DefaultCode implements Code {

    private int maxStack;
    private int maxLocals;

    private CodeBlockTable codeBlocks;

    private CodeExceptionTable exceptions;

    private LocalVariableTable variables;


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
    public int getStartPC() {
        return 0;
    }

    @Override
    public void setStartPC(final int pc) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public Instruction[] getInstructions() {
        return new Instruction[0];
    }

    /*
    public DefaultCode(final ByteCodeReader reader) throws IOException {
        reader.enterNode(this);

        this.maxStack = reader.readUnsignedShort();
        this.maxLocals = reader.readUnsignedShort();
        this.codeSize = reader.readInt();

        // have to read code here, kinda messy
        final byte[] code = new byte[codeSize];
        if (reader.read(code) < 0) {
            throw new IOException("reached end of input while reading code");
        }

        this.exceptions = reader.read(Identifier.CODE_EXCEPTION_TABLE);

        final AttributeSet attributes = reader.readAttributeSet();
        this.codeBlocks = createCodeBlockTable(reader, code, attributes);
        this.variables = createLocalVariableTable(attributes);

        reader.exitNode(this);
    }

    @Override
    public int getIndexOf(final CodeBlock block) {
        if (block == null) {
            return 0;
        }
        return block.getStartPC();
    }

    @Override
    public CodeBlock getCodeBlockAt(final int index) {
        return codeBlocks.getCodeBlockAt(index);
    }

    @Override
    public Label getLabel(final int pc, final int offset) {
        final int offsetPC = pc + offset;
        if (offsetPC > codeSize) {
            return null;
        }
        if (offsetPC == codeSize) {
            return new EndLabel(this);
        }
        if (offsetPC == 0) {
            return new StartLabel();
        } else {
            final CodeBlock block = codeBlocks.getCodeBlockAt(offsetPC);
            final int offsetFromBlock = offsetPC - block.getStartPC();

            return new CodeBlockLabel(this, offsetFromBlock);
        }
    }

    @Override
    public Label getOffsetLabel(final int offset) {
        return new OffsetLabel(offset);
    }

    @Override
    public int getCodeSize() {
        // delegate to frames structure
        // that will delegate to the code implementation
        return codeSize;
    }

    private DefaultCodeBlockTable createCodeBlockTable(final ByteCodeReader reader, final byte[] code, final AttributeSet attributes) {

        final LineNumber[] lines = getLines(attributes);
        final StackMapFrame[] frames = getFrames(attributes);

        final DefaultCodeBlockTable table = initializeCodeBlockTable(lines, frames);

        distributeInstructions(reader, code, table);

        return table;
    }

    private StackMapFrame[] getFrames(final AttributeSet attributeSet) {
        final StackMapTableAttribute stackMapTableAttribute = attributeSet.getAttribute(StackMapTableAttribute.class);
        if (stackMapTableAttribute != null) {
            return stackMapTableAttribute.getEntries();
        } else {
            return new StackMapFrame[0];
        }
    }

    private LineNumber[] getLines(final AttributeSet attributeSet) {
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

    private DefaultCodeBlockTable initializeCodeBlockTable(final LineNumber[] lines, final StackMapFrame[] frames) {
        final Map<Integer, CodeBlock> indices = new TreeMap<>();

        for (final LineNumber line : lines) {
            final int pc = line.getStartPC();
            indices.put(pc, new LineCodeBlock(this, line));
        }

        int lastOffset = 0;
        for (int i = 0; i < frames.length; i++) {
            final StackMapFrame frame = frames[i];
            if (i != 0) {
                lastOffset++;
            }
            lastOffset += frame.getOffsetDelta();

            indices.put(lastOffset, new FrameCodeBlock(this, frame, lastOffset));
        }

        final Collection<CodeBlock> values = indices.values();
        final CodeBlock[] blocks = values.toArray(new CodeBlock[values.size()]);

        return new DefaultCodeBlockTable(blocks);
    }

    private void distributeInstructions(final ByteCodeReader codeReader, final byte[] code, final DefaultCodeBlockTable codeBlocks) {
        final Iterator<CodeBlock> iterator = codeBlocks.iterator();
        if (!iterator.hasNext()) {
            return;
        }
        CodeBlock currentBlock = iterator.next();

        final ByteCodeReader reader = ByteCodeReaderFactory.createReader(codeReader, code);

        try {

            while (iterator.hasNext() && reader.available() > 0) {
                final CodeBlock nextBlock = iterator.next();

                int start = currentBlock.getStartPC();
                final int endPC = nextBlock.getStartPC();

                final List<AbstractInstruction> lineInstructions = new LinkedList<>();

                while (start < endPC) {
                    final AbstractInstruction next = reader.read(Identifier.INSTRUCTION);

                    lineInstructions.add(next);

                    start += next.getSize();
                }

                currentBlock.addInstructions(lineInstructions);

                currentBlock = nextBlock;
            }

            // dump the remaining instructions into last line
            final List<AbstractInstruction> lineInstructions = new LinkedList<>();
            while (reader.available() > 0) {
                final AbstractInstruction next = reader.read(Identifier.INSTRUCTION);
                lineInstructions.add(next);
            }
            currentBlock.addInstructions(lineInstructions);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    private LocalVariableTable createLocalVariableTable(final AttributeSet attributeSet) {
        final Set<LocalVariable> variables = new LinkedHashSet<>();

        final Set<LocalVariableTypeTableAttribute> localVariableTypeTableAttributes = attributeSet.getAttributes(LocalVariableTypeTableAttribute.class);

        if (localVariableTypeTableAttributes != null) {
            for (final LocalVariableTypeTableAttribute localVariableTypeTableAttribute : localVariableTypeTableAttributes) {
                final LocalVariable[] table = localVariableTypeTableAttribute.getTable();
                for (final LocalVariable type : table) {
                    variables.add(type);
                }
            }
        }

        final Set<LocalVariableTableAttribute> localVariableTableAttributes = attributeSet.getAttributes(LocalVariableTableAttribute.class);

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
        return new DefaultLocalVariableTable(new LocalVariable[variables.size()]);
    } */
}
