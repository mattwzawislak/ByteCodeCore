package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FLoad_1;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFLoad_1 extends AbstractInstruction implements FLoad_1 {

    public static final String MNEMONIC = "fload_1";

    public static final FLoad_1 INSTANCE = new DefaultFLoad_1();

    private DefaultFLoad_1() {
    }

    @Override
    public int getIndex() {
        return 1;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FLOAD_1;
    }
}
