package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class athrow extends Instruction {

    public static final String IDENTIFIER = "athrow";

    public static final athrow INSTANCE = new athrow();

    private athrow() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ATHROW;
    }
}
