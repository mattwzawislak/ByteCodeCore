package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.CAStore;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultCAStore extends AbstractInstruction implements CAStore {

    public static final String MNEMONIC = "castore";

    public static final CAStore INSTANCE = new DefaultCAStore();

    private DefaultCAStore() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_CASTORE;
    }
}
