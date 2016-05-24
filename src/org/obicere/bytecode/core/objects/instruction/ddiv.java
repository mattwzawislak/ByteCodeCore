package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class ddiv extends Instruction {

    public static final String IDENTIFIER = "ddiv";

    public static final ddiv INSTANCE = new ddiv();

    private ddiv() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DDIV;
    }
}
