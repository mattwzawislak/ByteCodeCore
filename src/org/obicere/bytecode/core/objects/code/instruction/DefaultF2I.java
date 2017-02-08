package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.F2I;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultF2I extends AbstractInstruction implements F2I {

    public static final String MNEMONIC = "f2i";

    public static final F2I INSTANCE = new DefaultF2I();

    private DefaultF2I() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_F2I;
    }
}
