package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LOr;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLOr extends AbstractInstruction implements LOr {

    public static final String MNEMONIC = "lor";

    public static final LOr INSTANCE = new DefaultLOr();

    private DefaultLOr() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LOR;
    }
}
