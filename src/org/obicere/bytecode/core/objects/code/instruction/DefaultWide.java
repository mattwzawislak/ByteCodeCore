package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Wide;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultWide extends AbstractInstruction implements Wide {

    public static final String MNEMONIC = "wide";

    private final String instructionName;

    private final int instruction;

    private final int index;

    private final int constant;

    public DefaultWide(final int instruction, final int index) {
        this(instruction, index, 0);
    }

    public DefaultWide(final int instruction, final int index, final int constant) {
        this.instruction = instruction;
        this.index = index;
        this.constant = constant;
        this.instructionName = getName(instruction);
    }

    @Override
    public int getLength(final int pc) {
        if (instruction == InstructionReader.OPCODE_IINC) {
            return 6;
        } else {
            return 4;
        }
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public int getConstant() {
        return constant;
    }

    @Override
    public int getInstruction() {
        return instruction;
    }

    public String getInstructionName() {
        return instructionName;
    }

    private String getName(final int instruction) {
        switch (instruction) {
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
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_WIDE;
    }
}
