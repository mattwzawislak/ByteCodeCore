package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.AAStore;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

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
        return InstructionReader.OPCODE_AASTORE;
    }
}
