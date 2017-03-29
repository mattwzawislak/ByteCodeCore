package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DDiv;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDDiv extends AbstractInstruction implements DDiv {

    public static final String MNEMONIC = "ddiv";

    public static final DDiv INSTANCE = new DefaultDDiv();

    private DefaultDDiv() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DDIV;
    }
}
