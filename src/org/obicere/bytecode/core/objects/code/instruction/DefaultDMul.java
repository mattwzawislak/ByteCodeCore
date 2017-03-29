package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DMul;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDMul extends AbstractInstruction implements DMul {

    public static final String MNEMONIC = "dmul";

    public static final DMul INSTANCE = new DefaultDMul();

    private DefaultDMul() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DMUL;
    }
}
