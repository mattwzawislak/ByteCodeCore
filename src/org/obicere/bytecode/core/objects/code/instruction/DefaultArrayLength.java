package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ArrayLength;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultArrayLength extends AbstractInstruction implements ArrayLength {

    public static final String MNEMONIC = "arraylength";

    public static final ArrayLength INSTANCE = new DefaultArrayLength();

    private DefaultArrayLength() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ARRAYLENGTH;
    }
}
