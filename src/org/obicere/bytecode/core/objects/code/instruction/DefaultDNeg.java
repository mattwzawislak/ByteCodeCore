package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DNeg;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultDNeg extends AbstractInstruction implements DNeg {

    public static final String MNEMONIC = "dneg";

    public static final DNeg INSTANCE = new DefaultDNeg();

    private DefaultDNeg() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_DNEG;
    }
}
