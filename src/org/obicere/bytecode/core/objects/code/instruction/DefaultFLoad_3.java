package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FLoad_3;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFLoad_3 extends AbstractInstruction implements FLoad_3 {

    public static final String MNEMONIC = "fload_3";

    public static final FLoad_3 INSTANCE = new DefaultFLoad_3();

    private DefaultFLoad_3() {
    }

    @Override
    public int getIndex() {
        return 3;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FLOAD_3;
    }
}
