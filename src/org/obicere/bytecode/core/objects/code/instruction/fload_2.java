package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fload_2 extends Instruction {

    public static final String IDENTIFIER = "fload_2";

    public static final fload_2 INSTANCE = new fload_2();

    private fload_2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FLOAD_2;
    }
}
