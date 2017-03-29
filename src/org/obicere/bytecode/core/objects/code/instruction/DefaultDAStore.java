package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DAStore;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDAStore extends AbstractInstruction implements DAStore {

    public static final String MNEMONIC = "dastore";

    public static final DAStore INSTANCE = new DefaultDAStore();

    private DefaultDAStore() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DASTORE;
    }
}
