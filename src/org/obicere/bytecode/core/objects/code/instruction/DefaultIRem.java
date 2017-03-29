package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IRem;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIRem extends AbstractInstruction implements IRem {

    public static final String MNEMONIC = "irem";

    public static final IRem INSTANCE = new DefaultIRem();

    private DefaultIRem() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_IREM;
    }
}
