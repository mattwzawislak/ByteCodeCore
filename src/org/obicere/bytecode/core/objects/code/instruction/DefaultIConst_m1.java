package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IConst_m1;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIConst_m1 extends AbstractInstruction implements IConst_m1 {

    public static final String MNEMONIC = "iconst_m1";

    public static final IConst_m1 INSTANCE = new DefaultIConst_m1();

    private DefaultIConst_m1() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_ICONST_M1;
    }
}
