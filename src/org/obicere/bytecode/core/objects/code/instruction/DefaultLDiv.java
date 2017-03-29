package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LDiv;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLDiv extends AbstractInstruction implements LDiv {

    public static final String MNEMONIC = "ldiv";

    public static final LDiv INSTANCE = new DefaultLDiv();

    private DefaultLDiv() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LDIV;
    }
}
