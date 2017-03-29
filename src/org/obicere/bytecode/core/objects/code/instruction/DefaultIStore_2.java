package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IStore_2;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIStore_2 extends AbstractInstruction implements IStore_2 {

    public static final String MNEMONIC = "istore_2";

    public static final IStore_2 INSTANCE = new DefaultIStore_2();

    private DefaultIStore_2() {
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
        return Instructions.OPCODE_ISTORE_2;
    }
}
