package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.SAStore;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

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
        return InstructionReader.OPCODE_SASTORE;
    }
}
