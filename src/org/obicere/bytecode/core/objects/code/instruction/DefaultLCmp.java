package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LCmp;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLCmp extends AbstractInstruction implements LCmp {

    public static final String MNEMONIC = "lcmp";

    public static final LCmp INSTANCE = new DefaultLCmp();

    private DefaultLCmp() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LCMP;
    }
}
