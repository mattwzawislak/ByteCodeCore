package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.I2L;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultI2L extends AbstractInstruction implements I2L {

    public static final String MNEMONIC = "i2l";

    public static final I2L INSTANCE = new DefaultI2L();

    private DefaultI2L() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_I2L;
    }
}
