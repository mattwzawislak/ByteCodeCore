package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FAStore;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFAStore extends AbstractInstruction implements FAStore {

    public static final String MNEMONIC = "fastore";

    public static final FAStore INSTANCE = new DefaultFAStore();

    private DefaultFAStore() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FASTORE;
    }
}
