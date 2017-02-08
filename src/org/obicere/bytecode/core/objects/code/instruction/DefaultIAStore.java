package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IAStore;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIAStore extends AbstractInstruction implements IAStore {

    public static final String MNEMONIC = "iastore";

    public static final IAStore INSTANCE = new DefaultIAStore();

    private DefaultIAStore() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_IASTORE;
    }
}
