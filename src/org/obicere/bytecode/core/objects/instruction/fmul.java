package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fmul extends Instruction {

    public static final String IDENTIFIER = "fmul";

    public static final fmul INSTANCE = new fmul();

    private fmul() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FMUL;
    }
}
