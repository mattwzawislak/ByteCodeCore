package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.L2I;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultL2I extends AbstractInstruction implements L2I {

    public static final String MNEMONIC = "l2i";

    public static final L2I INSTANCE = new DefaultL2I();

    private DefaultL2I() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_L2I;
    }
}
