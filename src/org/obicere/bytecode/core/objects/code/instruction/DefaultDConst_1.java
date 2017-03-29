package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DConst_1;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDConst_1 extends AbstractInstruction implements DConst_1 {

    public static final String MNEMONIC = "dconst_1";

    public static final DConst_1 INSTANCE = new DefaultDConst_1();

    private DefaultDConst_1() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DCONST_1;
    }
}
