package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DCmpL;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDCmpL extends AbstractInstruction implements DCmpL {

    public static final String MNEMONIC = "dcmpl";

    public static final DCmpL INSTANCE = new DefaultDCmpL();

    private DefaultDCmpL() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DCMPL;
    }
}
