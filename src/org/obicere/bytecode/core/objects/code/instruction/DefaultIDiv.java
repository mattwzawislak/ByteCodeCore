package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IDiv;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIDiv extends AbstractInstruction implements IDiv {

    public static final String MNEMONIC = "idiv";

    public static final IDiv INSTANCE = new DefaultIDiv();

    private DefaultIDiv() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_IDIV;
    }
}
