package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ArrayLength;
import org.javacore.code.instruction.Instructions;

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
        return Instructions.OPCODE_ARRAYLENGTH;
    }
}
