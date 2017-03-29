package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DStore;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDStore extends AbstractInstruction implements DStore {

    public static final  String MNEMONIC = "dstore";

    private final int index;

    public DefaultDStore(final int index) {
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
        return Instructions.OPCODE_DSTORE;
    }
}
