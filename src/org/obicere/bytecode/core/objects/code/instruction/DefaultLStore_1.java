package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LStore_1;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLStore_1 extends AbstractInstruction implements LStore_1 {

    public static final String MNEMONIC = "lstore_1";

    public static final LStore_1 INSTANCE = new DefaultLStore_1();

    private DefaultLStore_1() {
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
        return Instructions.OPCODE_LSTORE_1;
    }
}
