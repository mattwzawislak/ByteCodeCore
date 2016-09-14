package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lmul extends Instruction {

    public static final String IDENTIFIER = "lmul";

    public static final lmul INSTANCE = new lmul();

    private lmul() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LMUL;
    }
}
