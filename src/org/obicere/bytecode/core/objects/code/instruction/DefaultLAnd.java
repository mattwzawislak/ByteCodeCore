package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LAnd;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLAnd extends AbstractInstruction implements LAnd {

    public static final String MNEMONIC = "land";

    public static final LAnd INSTANCE = new DefaultLAnd();

    private DefaultLAnd() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LAND;
    }
}
