package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dconst_0 extends Instruction {

    public static final String IDENTIFIER = "dconst_0";

    public static final dconst_0 INSTANCE = new dconst_0();

    private dconst_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DCONST_0;
    }
}
