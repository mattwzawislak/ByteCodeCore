package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ALoad_3;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultALoad_3 extends AbstractInstruction implements ALoad_3 {

    public static final String MNEMONIC = "aload_3";

    public static final ALoad_3 INSTANCE = new DefaultALoad_3();

    private DefaultALoad_3() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_ALOAD_3;
    }

    @Override
    public int getIndex() {
        return 3;
    }
}
