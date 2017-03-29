package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LStore;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLStore extends AbstractInstruction implements LStore {

    public static final String MNEMONIC = "lstore";

    private final int index;

    public DefaultLStore(final int index) {
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LSTORE;
    }
}
