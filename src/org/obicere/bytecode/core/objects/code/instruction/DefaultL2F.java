package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.L2F;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultL2F extends AbstractInstruction implements L2F {

    public static final String MNEMONIC = "l2f";

    public static final L2F INSTANCE = new DefaultL2F();

    private DefaultL2F() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_L2F;
    }
}
