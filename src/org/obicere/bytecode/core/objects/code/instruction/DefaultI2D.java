package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.I2D;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultI2D extends AbstractInstruction implements I2D {

    public static final String MNEMONIC = "i2d";

    public static final I2D INSTANCE = new DefaultI2D();

    private DefaultI2D() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_I2D;
    }
}
