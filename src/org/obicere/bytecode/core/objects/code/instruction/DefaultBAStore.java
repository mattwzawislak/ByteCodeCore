package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.BAStore;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

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
        return InstructionReader.OPCODE_BASTORE;
    }
}
