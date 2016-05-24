package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fneg extends Instruction {

    public static final String IDENTIFIER = "fneg";

    public static final fneg INSTANCE = new fneg();

    private fneg() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FNEG;
    }
}
