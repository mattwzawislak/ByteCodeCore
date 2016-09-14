package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fload_3 extends Instruction {

    public static final String IDENTIFIER = "fload_3";

    public static final fload_3 INSTANCE = new fload_3();

    private fload_3() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FLOAD_3;
    }
}
