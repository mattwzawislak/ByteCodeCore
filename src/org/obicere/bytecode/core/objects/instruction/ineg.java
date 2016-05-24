package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class ineg extends Instruction {

    public static final String IDENTIFIER = "ineg";

    public static final ineg INSTANCE = new ineg();

    private ineg() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_INEG;
    }
}
