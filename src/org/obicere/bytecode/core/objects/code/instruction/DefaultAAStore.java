package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.AAStore;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultAAStore extends AbstractInstruction implements AAStore {

    public static final String MNEMONIC = "aastore";

    public static final AAStore INSTANCE = new DefaultAAStore();

    private DefaultAAStore() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_AASTORE;
    }
}
