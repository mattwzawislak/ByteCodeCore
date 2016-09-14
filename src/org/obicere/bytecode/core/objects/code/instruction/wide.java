package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class wide extends Instruction {

    public static final String IDENTIFIER = "wide";

    private final String instructionName;

    private final int instruction;

    private final int index;

    private final int constant;

    public wide(final int instruction, final int index) {
        this(instruction, index, 0);
    }

    public wide(final int instruction, final int index, final int constant) {
        this.instruction = instruction;
        this.index = index;
        this.constant = constant;
        this.instructionName = getName();
    }

    public int getIndex() {
        return index;
    }

    public int getConstant() {
        return constant;
    }

    public int getInstruction() {
        return instruction;
    }

    public String getInstructionName(){
        return instructionName;
    }

    private String getName(){
        switch (instruction){
            case InstructionReader.OPCODE_IINC:
                return "iinc";
            case InstructionReader.OPCODE_ILOAD:
                return "iload";
            case InstructionReader.OPCODE_FLOAD:
                return "fload";
            case InstructionReader.OPCODE_ALOAD:
                return "aload";
            case InstructionReader.OPCODE_LLOAD:
                return "lload";
            case InstructionReader.OPCODE_DLOAD:
                return "dload";
            case InstructionReader.OPCODE_ISTORE:
                return "istore";
            case InstructionReader.OPCODE_FSTORE:
                return "fstore";
            case InstructionReader.OPCODE_ASTORE:
                return "astore";
            case InstructionReader.OPCODE_LSTORE:
                return "lstore";
            case InstructionReader.OPCODE_DSTORE:
                return "dstore";
            case InstructionReader.OPCODE_RET:
                return "ret";
            default:
                throw new IllegalArgumentException("illegal operand for wide: " + instruction);

        }
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_WIDE;
    }
}
