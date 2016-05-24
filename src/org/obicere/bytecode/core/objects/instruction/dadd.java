package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dadd extends Instruction {

    public static final String IDENTIFIER = "dadd";

    public static final dadd INSTANCE = new dadd();

    private dadd() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DADD;
    }
}
