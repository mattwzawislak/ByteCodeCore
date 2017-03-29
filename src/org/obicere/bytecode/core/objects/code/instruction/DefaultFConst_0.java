package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FConst_0;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFConst_0 extends AbstractInstruction implements FConst_0 {

    public static final String MNEMONIC = "fconst_0";

    public static final FConst_0 INSTANCE = new DefaultFConst_0();

    private DefaultFConst_0() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FCONST_0;
    }
}
