package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Dup2;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDup2 extends AbstractInstruction implements Dup2 {

    public static final String MNEMONIC = "dup2";

    public static final Dup2 INSTANCE = new DefaultDup2();

    private DefaultDup2() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DUP2;
    }
}
