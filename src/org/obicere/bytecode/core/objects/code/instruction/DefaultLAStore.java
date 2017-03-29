package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LAStore;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLAStore extends AbstractInstruction implements LAStore {

    public static final String MNEMONIC = "lastore";

    public static final LAStore INSTANCE = new DefaultLAStore();

    private DefaultLAStore() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LASTORE;
    }
}
