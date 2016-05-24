package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class freturn extends Instruction {

    public static final String IDENTIFIER = "freturn";

    public static final freturn INSTANCE = new freturn();

    private freturn() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FRETURN;
    }
}
