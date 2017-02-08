package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DAStore;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDAStore extends AbstractInstruction implements DAStore {

    public static final String MNEMONIC = "dastore";

    public static final DAStore INSTANCE = new DefaultDAStore();

    private DefaultDAStore() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DASTORE;
    }
}
