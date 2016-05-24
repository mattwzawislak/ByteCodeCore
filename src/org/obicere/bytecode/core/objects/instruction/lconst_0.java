package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lconst_0 extends Instruction {

    public static final String IDENTIFIER = "lconst_0";

    public static final lconst_0 INSTANCE = new lconst_0();

    private lconst_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LCONST_0;
    }
}
