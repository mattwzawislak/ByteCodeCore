package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Swap;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultSwap extends AbstractInstruction implements Swap {

    public static final String MNEMONIC = "swap";

    public static final Swap INSTANCE = new DefaultSwap();

    private DefaultSwap() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_SWAP;
    }
}
