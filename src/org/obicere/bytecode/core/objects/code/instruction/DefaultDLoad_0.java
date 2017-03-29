package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DLoad_0;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDLoad_0 extends AbstractInstruction implements DLoad_0 {

    public static final String MNEMONIC = "dload_0";

    public static final DLoad_0 INSTANCE = new DefaultDLoad_0();

    private DefaultDLoad_0() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DLOAD_0;
    }

    @Override
    public int getIndex() {
        return 0;
    }
}
