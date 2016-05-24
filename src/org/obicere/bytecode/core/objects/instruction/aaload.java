package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class aaload extends Instruction {

    public static final String IDENTIFIER = "aaload";

    public static final aaload INSTANCE = new aaload();

    private aaload() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_AALOAD;
    }
}
