package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fstore_2 extends Instruction {

    public static final String IDENTIFIER = "fstore_2";

    public static final fstore_2 INSTANCE = new fstore_2();

    private fstore_2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FSTORE_2;
    }
}
