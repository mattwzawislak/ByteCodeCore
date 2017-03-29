package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IAnd;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIAnd extends AbstractInstruction implements IAnd {

    public static final String MNEMONIC = "iand";

    public static final IAnd INSTANCE = new DefaultIAnd();

    private DefaultIAnd() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_IAND;
    }
}
