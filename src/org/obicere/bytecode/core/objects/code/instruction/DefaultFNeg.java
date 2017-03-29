package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FNeg;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFNeg extends AbstractInstruction implements FNeg {

    public static final String MNEMONIC = "fneg";

    public static final FNeg INSTANCE = new DefaultFNeg();

    private DefaultFNeg() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FNEG;
    }
}
