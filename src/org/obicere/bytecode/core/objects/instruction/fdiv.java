package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fdiv extends Instruction {

    public static final String IDENTIFIER = "fdiv";

    public static final fdiv INSTANCE = new fdiv();

    private fdiv() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FDIV;
    }
}
