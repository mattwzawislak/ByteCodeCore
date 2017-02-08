package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ISub;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultISub extends AbstractInstruction implements ISub {

    public static final String MNEMONIC = "isub";

    public static final ISub INSTANCE = new DefaultISub();

    private DefaultISub() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ISUB;
    }
}
