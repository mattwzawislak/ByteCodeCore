package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fconst_0 extends Instruction {

    public static final String IDENTIFIER = "fconst_0";

    public static final fconst_0 INSTANCE = new fconst_0();

    private fconst_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FCONST_0;
    }
}
