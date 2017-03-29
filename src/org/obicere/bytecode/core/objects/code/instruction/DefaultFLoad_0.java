package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FLoad_0;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFLoad_0 extends AbstractInstruction implements FLoad_0 {

    public static final String MNEMONIC = "fload_0";

    public static final FLoad_0 INSTANCE = new DefaultFLoad_0();

    private DefaultFLoad_0() {
    }

    @Override
    public int getIndex() {
        return 0;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FLOAD_0;
    }
}
