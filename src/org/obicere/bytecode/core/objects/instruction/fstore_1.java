package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fstore_1 extends Instruction {

    public static final String IDENTIFIER = "fstore_1";

    public static final fstore_1 INSTANCE = new fstore_1();

    private fstore_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FSTORE_1;
    }
}
