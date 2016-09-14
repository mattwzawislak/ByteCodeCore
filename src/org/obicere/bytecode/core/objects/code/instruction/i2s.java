package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class i2s extends Instruction {

    public static final String IDENTIFIER = "i2s";

    public static final i2s INSTANCE = new i2s();

    private i2s() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_I2S;
    }
}
