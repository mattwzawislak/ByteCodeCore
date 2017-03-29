package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DReturn;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDReturn extends AbstractInstruction implements DReturn {

    public static final String MNEMONIC = "dreturn";

    public static final DReturn INSTANCE = new DefaultDReturn();

    private DefaultDReturn() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DRETURN;
    }
}
