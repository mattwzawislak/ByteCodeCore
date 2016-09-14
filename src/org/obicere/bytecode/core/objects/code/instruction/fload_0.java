package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fload_0 extends Instruction {

    public static final String IDENTIFIER = "fload_0";

    public static final fload_0 INSTANCE = new fload_0();

    private fload_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FLOAD_0;
    }
}
