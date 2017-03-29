package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Pop;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultPop extends AbstractInstruction implements Pop {

    public static final String MNEMONIC = "pop";

    public static final Pop INSTANCE = new DefaultPop();

    private DefaultPop() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_POP;
    }
}
