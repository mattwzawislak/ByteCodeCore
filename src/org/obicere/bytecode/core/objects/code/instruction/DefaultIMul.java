package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IMul;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIMul extends AbstractInstruction implements IMul {

    public static final String MNEMONIC = "imul";

    public static final IMul INSTANCE = new DefaultIMul();

    private DefaultIMul() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_IMUL;
    }
}
