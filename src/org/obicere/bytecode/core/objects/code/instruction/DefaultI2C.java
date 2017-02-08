package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.I2C;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultI2C extends AbstractInstruction implements I2C {

    public static final String MNEMONIC = "i2c";

    public static final I2C INSTANCE = new DefaultI2C();

    private DefaultI2C() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_I2C;
    }
}
