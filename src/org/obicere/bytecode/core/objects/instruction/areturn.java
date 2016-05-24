package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class areturn extends Instruction {

    public static final String IDENTIFIER = "areturn";

    public static final areturn INSTANCE = new areturn();

    private areturn() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ARETURN;
    }
}
