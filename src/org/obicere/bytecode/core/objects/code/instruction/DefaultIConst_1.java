package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IConst_1;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIConst_1 extends AbstractInstruction implements IConst_1 {

    public static final String MNEMONIC = "iconst_1";

    public static final IConst_1 INSTANCE = new DefaultIConst_1();

    private DefaultIConst_1() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_ICONST_1;
    }
}
