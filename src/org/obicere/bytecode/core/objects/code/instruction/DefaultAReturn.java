package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.AReturn;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultAReturn extends AbstractInstruction implements AReturn {

    public static final String MNEMONIC = "areturn";

    public static final AReturn INSTANCE = new DefaultAReturn();

    private DefaultAReturn() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_ARETURN;
    }
}
