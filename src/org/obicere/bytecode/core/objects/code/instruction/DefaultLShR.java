package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LShR;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLShR extends AbstractInstruction implements LShR {

    public static final String MNEMONIC = "lshr";

    public static final LShR INSTANCE = new DefaultLShR();

    private DefaultLShR() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LSHR;
    }
}
