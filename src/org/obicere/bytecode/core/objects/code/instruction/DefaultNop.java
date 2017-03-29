package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Nop;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultNop extends AbstractInstruction implements Nop {

    public static final String MNEMONIC = "nop";

    public static final Nop INSTANCE = new DefaultNop();

    private DefaultNop() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_NOP;
    }
}
