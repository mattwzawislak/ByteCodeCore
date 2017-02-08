package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.I2F;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultI2F extends AbstractInstruction implements I2F {

    public static final String MNEMONIC = "i2f";

    public static final I2F INSTANCE = new DefaultI2F();

    private DefaultI2F() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_I2F;
    }
}
