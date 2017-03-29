package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IConst_2;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIConst_2 extends AbstractInstruction implements IConst_2 {

    public static final String MNEMONIC = "iconst_2";

    public static final IConst_2 INSTANCE = new DefaultIConst_2();

    private DefaultIConst_2() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_ICONST_2;
    }
}
