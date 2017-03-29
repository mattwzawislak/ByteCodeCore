package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FMul;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFMul extends AbstractInstruction implements FMul {

    public static final String MNEMONIC = "fmul";

    public static final FMul INSTANCE = new DefaultFMul();

    private DefaultFMul() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FMUL;
    }
}
