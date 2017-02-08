package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LNeg;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLNeg extends AbstractInstruction implements LNeg {

    public static final String MNEMONIC = "lneg";

    public static final LNeg INSTANCE = new DefaultLNeg();

    private DefaultLNeg() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LNEG;
    }
}
