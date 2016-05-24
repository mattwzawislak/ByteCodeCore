package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fadd extends Instruction {

    public static final String IDENTIFIER = "fadd";

    public static final fadd INSTANCE = new fadd();

    private fadd() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FADD;
    }
}
