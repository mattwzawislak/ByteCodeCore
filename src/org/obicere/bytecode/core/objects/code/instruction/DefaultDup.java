package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Dup;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDup extends AbstractInstruction implements Dup {

    public static final String MNEMONIC = "dup";

    public static final Dup INSTANCE = new DefaultDup();

    private DefaultDup() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DUP;
    }
}
