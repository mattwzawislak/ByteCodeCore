package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FSub;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFSub extends AbstractInstruction implements FSub {

    public static final String MNEMONIC = "fsub";

    public static final FSub INSTANCE = new DefaultFSub();

    private DefaultFSub() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FSUB;
    }
}
