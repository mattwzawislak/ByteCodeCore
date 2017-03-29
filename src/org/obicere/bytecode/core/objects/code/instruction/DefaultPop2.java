package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Pop2;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultPop2 extends AbstractInstruction implements Pop2 {

    public static final String MNEMONIC = "pop2";

    public static final Pop2 INSTANCE = new DefaultPop2();

    private DefaultPop2() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_POP2;
    }
}
