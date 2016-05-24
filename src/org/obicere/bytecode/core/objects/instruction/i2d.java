package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class i2d extends Instruction {

    public static final String IDENTIFIER = "i2d";

    public static final i2d INSTANCE = new i2d();

    private i2d() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_I2D;
    }
}
