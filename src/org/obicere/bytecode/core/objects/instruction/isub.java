package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class isub extends Instruction {

    public static final String IDENTIFIER = "isub";

    public static final isub INSTANCE = new isub();

    private isub() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ISUB;
    }
}
