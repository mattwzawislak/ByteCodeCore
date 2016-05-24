package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fconst_1 extends Instruction {

    public static final String IDENTIFIER = "fconst_1";

    public static final fconst_1 INSTANCE = new fconst_1();

    private fconst_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FCONST_1;
    }
}
