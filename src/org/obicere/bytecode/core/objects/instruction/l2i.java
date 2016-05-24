package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class l2i extends Instruction {

    public static final String IDENTIFIER = "l2i";

    public static final l2i INSTANCE = new l2i();

    private l2i() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_L2I;
    }
}
