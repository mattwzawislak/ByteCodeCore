package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class l2d extends Instruction {

    public static final String IDENTIFIER = "l2d";

    public static final l2d INSTANCE = new l2d();

    private l2d() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_L2D;
    }
}
