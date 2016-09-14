package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lreturn extends Instruction {

    public static final String IDENTIFIER = "lreturn";

    public static final lreturn INSTANCE = new lreturn();

    private lreturn() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LRETURN;
    }
}
