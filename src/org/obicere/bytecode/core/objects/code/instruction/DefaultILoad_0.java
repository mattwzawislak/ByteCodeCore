package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ILoad_0;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultILoad_0 extends AbstractInstruction implements ILoad_0 {

    public static final String MNEMONIC = "iload_0";

    public static final ILoad_0 INSTANCE = new DefaultILoad_0();

    private DefaultILoad_0() {
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
        return Instructions.OPCODE_ILOAD_0;
    }
}
