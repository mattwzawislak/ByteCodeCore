package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.AThrow;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultAThrow extends AbstractInstruction implements AThrow {

    public static final String MNEMONIC = "athrow";

    public static final AThrow INSTANCE = new DefaultAThrow();

    private DefaultAThrow() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_ATHROW;
    }
}
