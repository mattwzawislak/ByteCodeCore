package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IXor;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIXor extends AbstractInstruction implements IXor {

    public static final String MNEMONIC = "ixor";

    public static final IXor INSTANCE = new DefaultIXor();

    private DefaultIXor() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_IXOR;
    }
}
