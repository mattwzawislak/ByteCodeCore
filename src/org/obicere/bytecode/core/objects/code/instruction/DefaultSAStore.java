package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.SAStore;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultSAStore extends AbstractInstruction implements SAStore {

    public static final String MNEMONIC = "sastore";

    public static final SAStore INSTANCE = new DefaultSAStore();

    private DefaultSAStore() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_SASTORE;
    }
}
