package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FNeg;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFNeg extends AbstractInstruction implements FNeg {

    public static final String MNEMONIC = "fneg";

    public static final FNeg INSTANCE = new DefaultFNeg();

    private DefaultFNeg() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FNEG;
    }
}
