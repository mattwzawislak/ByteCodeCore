package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Dup2_x2;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDup2_x2 extends AbstractInstruction implements Dup2_x2 {

    public static final String MNEMONIC = "dup2_x2";

    public static final Dup2_x2 INSTANCE = new DefaultDup2_x2();

    private DefaultDup2_x2() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DUP2_X2;
    }
}
