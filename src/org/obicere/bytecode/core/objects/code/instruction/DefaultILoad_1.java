package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ILoad_1;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultILoad_1 extends AbstractInstruction implements ILoad_1 {

    public static final String MNEMONIC = "iload_1";

    public static final ILoad_1 INSTANCE = new DefaultILoad_1();

    private DefaultILoad_1() {
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
        return Instructions.OPCODE_ILOAD_1;
    }
}
