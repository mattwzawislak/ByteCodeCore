package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Dup_x1;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDup_x1 extends AbstractInstruction implements Dup_x1 {

    public static final String MNEMONIC = "dup_x1";

    public static final Dup_x1 INSTANCE = new DefaultDup_x1();

    private DefaultDup_x1() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DUP_X1;
    }
}
