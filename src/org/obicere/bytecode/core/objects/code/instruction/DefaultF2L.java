package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.F2L;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultF2L extends AbstractInstruction implements F2L {

    public static final String MNEMONIC = "f2l";

    public static final F2L INSTANCE = new DefaultF2L();

    private DefaultF2L() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_F2L;
    }
}
