package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FStore_2;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFStore_2 extends AbstractInstruction implements FStore_2 {

    public static final String MNEMONIC = "fstore_2";

    public static final FStore_2 INSTANCE = new DefaultFStore_2();

    private DefaultFStore_2() {
    }

    @Override
    public int getIndex() {
        return 2;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FSTORE_2;
    }
}
