package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FCmpL;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFCmpL extends AbstractInstruction implements FCmpL {

    public static final String MNEMONIC = "fcmpl";

    public static final FCmpL INSTANCE = new DefaultFCmpL();

    private DefaultFCmpL() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FCMPL;
    }
}
