package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dreturn extends Instruction {

    public static final String IDENTIFIER = "dreturn";

    public static final dreturn INSTANCE = new dreturn();

    private dreturn() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DRETURN;
    }
}
