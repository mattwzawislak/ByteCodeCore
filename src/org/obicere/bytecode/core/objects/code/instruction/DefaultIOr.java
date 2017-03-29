package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IOr;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIOr extends AbstractInstruction implements IOr {

    public static final String MNEMONIC = "ior";

    public static final IOr INSTANCE = new DefaultIOr();

    private DefaultIOr() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_IOR;
    }
}
