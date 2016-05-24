package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class i2c extends Instruction {

    public static final String IDENTIFIER = "i2c";

    public static final i2c INSTANCE = new i2c();

    private i2c() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_I2C;
    }
}
