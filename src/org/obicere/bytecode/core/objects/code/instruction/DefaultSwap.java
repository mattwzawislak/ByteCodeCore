package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Swap;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultSwap extends AbstractInstruction implements Swap {

    public static final String MNEMONIC = "swap";

    public static final Swap INSTANCE = new DefaultSwap();

    private DefaultSwap() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_SWAP;
    }
}
