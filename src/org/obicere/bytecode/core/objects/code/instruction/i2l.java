package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class i2l extends Instruction {

    public static final String IDENTIFIER = "i2l";

    public static final i2l INSTANCE = new i2l();

    private i2l() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_I2L;
    }
}
