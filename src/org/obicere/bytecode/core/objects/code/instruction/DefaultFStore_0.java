package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FStore_0;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFStore_0 extends AbstractInstruction implements FStore_0 {

    public static final String MNEMONIC = "fstore_0";

    public static final FStore_0 INSTANCE = new DefaultFStore_0();

    private DefaultFStore_0() {
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
        return Instructions.OPCODE_FSTORE_0;
    }
}
