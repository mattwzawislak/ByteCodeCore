package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.D2L;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultD2L extends AbstractInstruction implements D2L {

    public static final String MNEMONIC = "d2l";

    public static final D2L INSTANCE = new DefaultD2L();

    private DefaultD2L() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_D2L;
    }
}
