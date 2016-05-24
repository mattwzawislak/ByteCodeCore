package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fconst_2 extends Instruction {

    public static final String IDENTIFIER = "fconst_2";

    public static final fconst_2 INSTANCE = new fconst_2();

    private fconst_2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FCONST_2;
    }
}
