package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.AStore_2;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultAStore_2 extends AbstractInstruction implements AStore_2 {

    public static final String MNEMONIC = "astore_2";

    public static final AStore_2 INSTANCE = new DefaultAStore_2();

    private DefaultAStore_2() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_ASTORE_2;
    }

    @Override
    public int getIndex() {
        return 2;
    }
}
