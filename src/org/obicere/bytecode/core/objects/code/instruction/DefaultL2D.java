package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.L2D;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultL2D extends AbstractInstruction implements L2D {

    public static final String MNEMONIC = "l2d";

    public static final L2D INSTANCE = new DefaultL2D();

    private DefaultL2D() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_L2D;
    }
}
