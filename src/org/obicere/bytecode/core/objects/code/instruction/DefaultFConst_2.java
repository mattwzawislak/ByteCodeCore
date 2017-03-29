package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FConst_2;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFConst_2 extends AbstractInstruction implements FConst_2 {

    public static final String MNEMONIC = "fconst_2";

    public static final FConst_2 INSTANCE = new DefaultFConst_2();

    private DefaultFConst_2() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FCONST_2;
    }
}
