package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LStore_0;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLStore_0 extends AbstractInstruction implements LStore_0 {

    public static final String MNEMONIC = "lstore_0";

    public static final LStore_0 INSTANCE = new DefaultLStore_0();

    private DefaultLStore_0() {
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
        return Instructions.OPCODE_LSTORE_0;
    }
}
