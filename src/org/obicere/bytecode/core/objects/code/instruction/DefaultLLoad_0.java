package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LLoad_0;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLLoad_0 extends AbstractInstruction implements LLoad_0 {

    public static final String MNEMONIC = "lload_0";

    public static final LLoad_0 INSTANCE = new DefaultLLoad_0();

    private DefaultLLoad_0() {
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
        return Instructions.OPCODE_LLOAD_0;
    }
}
