package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DNeg;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

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
        return InstructionReader.OPCODE_DNEG;
    }
}
