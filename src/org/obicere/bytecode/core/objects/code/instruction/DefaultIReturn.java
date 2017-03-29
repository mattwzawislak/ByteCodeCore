package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IReturn;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIReturn extends AbstractInstruction implements IReturn {

    public static final String MNEMONIC = "ireturn";

    public static final IReturn INSTANCE = new DefaultIReturn();

    private DefaultIReturn() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_IRETURN;
    }
}
