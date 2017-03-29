package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ILoad_2;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultILoad_2 extends AbstractInstruction implements ILoad_2 {

    public static final String MNEMONIC = "iload_2";

    public static final ILoad_2 INSTANCE = new DefaultILoad_2();

    private DefaultILoad_2() {
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
        return Instructions.OPCODE_ILOAD_2;
    }
}
