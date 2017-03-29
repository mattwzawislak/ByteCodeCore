package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LStore_3;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLStore_3 extends AbstractInstruction implements LStore_3 {

    public static final String MNEMONIC = "lstore_3";

    public static final LStore_3 INSTANCE = new DefaultLStore_3();

    private DefaultLStore_3() {
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
        return Instructions.OPCODE_LSTORE_3;
    }
}
