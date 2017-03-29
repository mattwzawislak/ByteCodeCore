package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Dup_x2;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDup_x2 extends AbstractInstruction implements Dup_x2 {

    public static final String MNEMONIC = "dup_x2";

    public static final Dup_x2 INSTANCE = new DefaultDup_x2();

    private DefaultDup_x2() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DUP_X2;
    }
}
