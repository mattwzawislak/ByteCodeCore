package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fstore_0 extends Instruction {

    public static final String IDENTIFIER = "fstore_0";

    public static final fstore_0 INSTANCE = new fstore_0();

    private fstore_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FSTORE_0;
    }
}
