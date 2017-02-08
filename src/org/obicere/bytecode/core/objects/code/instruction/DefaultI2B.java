package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.I2B;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultI2B extends AbstractInstruction implements I2B {

    public static final String MNEMONIC = "i2b";

    public static final I2B INSTANCE = new DefaultI2B();

    private DefaultI2B() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_I2B;
    }
}
