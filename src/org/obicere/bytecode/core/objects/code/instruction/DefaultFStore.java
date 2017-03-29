package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FStore;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFStore extends AbstractInstruction implements FStore {

    public static final String MNEMONIC = "fstore";

    private final int index;

    public DefaultFStore(final int index) {
        this.index = index;
    }

    @Override
    public int getLength(final int pc) {
        return 2;
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
        return Instructions.OPCODE_FSTORE;
    }
}
