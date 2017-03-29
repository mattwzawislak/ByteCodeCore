package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FCmpG;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFCmpG extends AbstractInstruction implements FCmpG {

    public static final String MNEMONIC = "fcmpg";

    public static final FCmpG INSTANCE = new DefaultFCmpG();

    private DefaultFCmpG() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FCMPG;
    }
}
