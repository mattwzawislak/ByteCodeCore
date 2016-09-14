package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class i2b extends Instruction {

    public static final String IDENTIFIER = "i2b";

    public static final i2b INSTANCE = new i2b();

    private i2b() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_I2B;
    }
}
