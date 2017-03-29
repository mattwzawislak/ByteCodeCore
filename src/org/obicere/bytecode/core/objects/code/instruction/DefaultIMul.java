package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IMul;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIMul extends AbstractInstruction implements IMul {

    public static final String MNEMONIC = "imul";

    public static final IMul INSTANCE = new DefaultIMul();

    private DefaultIMul() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_IMUL;
    }
}
