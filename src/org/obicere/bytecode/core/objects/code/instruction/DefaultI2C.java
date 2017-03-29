package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.I2C;
import org.javacore.code.instruction.Instructions;

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
        return Instructions.OPCODE_I2C;
    }
}
