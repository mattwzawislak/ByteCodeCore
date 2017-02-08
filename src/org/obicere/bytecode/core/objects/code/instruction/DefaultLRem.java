package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LRem;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLRem extends AbstractInstruction implements LRem {

    public static final String MNEMONIC = "lrem";

    public static final LRem INSTANCE = new DefaultLRem();

    private DefaultLRem() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LREM;
    }
}
