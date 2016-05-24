package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lneg extends Instruction {

    public static final String IDENTIFIER = "lneg";

    public static final lneg INSTANCE = new lneg();

    private lneg() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LNEG;
    }
}
