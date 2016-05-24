package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dconst_1 extends Instruction {

    public static final String IDENTIFIER = "dconst_1";

    public static final dconst_1 INSTANCE = new dconst_1();

    private dconst_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DCONST_1;
    }
}
