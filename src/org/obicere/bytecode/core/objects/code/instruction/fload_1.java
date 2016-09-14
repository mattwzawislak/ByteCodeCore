package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fload_1 extends Instruction {

    public static final String IDENTIFIER = "fload_1";

    public static final fload_1 INSTANCE = new fload_1();

    private fload_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FLOAD_1;
    }
}
