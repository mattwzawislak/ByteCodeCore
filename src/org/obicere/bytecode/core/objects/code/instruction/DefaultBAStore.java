package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.BAStore;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultBAStore extends AbstractInstruction implements BAStore {

    public static final String MNEMONIC = "bastore";

    public static final BAStore INSTANCE = new DefaultBAStore();

    private DefaultBAStore() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_BASTORE;
    }
}
