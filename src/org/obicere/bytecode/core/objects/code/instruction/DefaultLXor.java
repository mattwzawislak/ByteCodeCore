package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LXor;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLXor extends AbstractInstruction implements LXor {

    public static final String MNEMONIC = "lxor";

    public static final LXor INSTANCE = new DefaultLXor();

    private DefaultLXor() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LXOR;
    }
}
