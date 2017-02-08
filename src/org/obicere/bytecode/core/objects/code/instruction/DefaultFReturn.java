package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FReturn;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFReturn extends AbstractInstruction implements FReturn {

    public static final String MNEMONIC = "freturn";

    public static final FReturn INSTANCE = new DefaultFReturn();

    private DefaultFReturn() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FRETURN;
    }
}
