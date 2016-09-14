package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class ixor extends Instruction {

    public static final String IDENTIFIER = "ixor";

    public static final ixor INSTANCE = new ixor();

    private ixor() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_IXOR;
    }
}
