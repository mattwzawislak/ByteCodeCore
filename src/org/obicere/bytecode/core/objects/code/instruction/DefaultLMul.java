package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LMul;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLMul extends AbstractInstruction implements LMul {

    public static final String MNEMONIC = "lmul";

    public static final LMul INSTANCE = new DefaultLMul();

    private DefaultLMul() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LMUL;
    }
}
