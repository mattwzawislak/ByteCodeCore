package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LAdd;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLAdd extends AbstractInstruction implements LAdd {

    public static final String MNEMONIC = "ladd";

    public static final LAdd INSTANCE = new DefaultLAdd();

    private DefaultLAdd() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LADD;
    }
}
