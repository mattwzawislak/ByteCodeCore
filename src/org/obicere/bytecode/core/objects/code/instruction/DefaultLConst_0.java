package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LConst_0;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLConst_0 extends AbstractInstruction implements LConst_0 {

    public static final String MNEMONIC = "lconst_0";

    public static final LConst_0 INSTANCE = new DefaultLConst_0();

    private DefaultLConst_0() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LCONST_0;
    }
}
