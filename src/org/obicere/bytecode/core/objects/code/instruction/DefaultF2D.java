package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.F2D;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultF2D extends AbstractInstruction implements F2D {

    public static final String MNEMONIC = "f2d";

    public static final F2D INSTANCE = new DefaultF2D();

    private DefaultF2D() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_F2D;
    }
}
