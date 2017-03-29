package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.I2S;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultI2S extends AbstractInstruction implements I2S {

    public static final String MNEMONIC = "i2s";

    public static final I2S INSTANCE = new DefaultI2S();

    private DefaultI2S() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_I2S;
    }
}
