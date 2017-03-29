package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LNeg;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLNeg extends AbstractInstruction implements LNeg {

    public static final String MNEMONIC = "lneg";

    public static final LNeg INSTANCE = new DefaultLNeg();

    private DefaultLNeg() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LNEG;
    }
}
