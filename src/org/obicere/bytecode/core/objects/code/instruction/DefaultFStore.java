package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FStore;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

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
    public int getIndex() {
        return index;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FSTORE;
    }
}
