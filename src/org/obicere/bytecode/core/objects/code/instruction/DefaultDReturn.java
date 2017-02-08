package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DReturn;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDReturn extends AbstractInstruction implements DReturn {

    public static final String MNEMONIC = "dreturn";

    public static final DReturn INSTANCE = new DefaultDReturn();

    private DefaultDReturn() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DRETURN;
    }
}
