package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fstore_3 extends Instruction {

    public static final String IDENTIFIER = "fstore_3";

    public static final fstore_3 INSTANCE = new fstore_3();

    private fstore_3() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FSTORE_3;
    }
}
