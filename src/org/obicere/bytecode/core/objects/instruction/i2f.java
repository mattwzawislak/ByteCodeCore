package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class i2f extends Instruction {

    public static final String IDENTIFIER = "i2f";

    public static final i2f INSTANCE = new i2f();

    private i2f() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_I2F;
    }
}
