package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LMul;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLMul extends AbstractInstruction implements LMul {

    public static final String MNEMONIC = "lmul";

    public static final LMul INSTANCE = new DefaultLMul();

    private DefaultLMul() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LMUL;
    }
}
