package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class bastore extends Instruction {

    public static final String IDENTIFIER = "bastore";

    public static final bastore INSTANCE = new bastore();

    private bastore() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_BASTORE;
    }
}
