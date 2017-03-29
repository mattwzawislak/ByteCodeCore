package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DCmpG;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDCmpG extends AbstractInstruction implements DCmpG {

    public static final String MNEMONIC = "dcmpg";

    public static final DCmpG INSTANCE = new DefaultDCmpG();

    private DefaultDCmpG() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DCMPG;
    }
}
