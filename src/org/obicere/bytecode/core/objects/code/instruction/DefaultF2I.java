package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.F2I;
import org.javacore.code.instruction.Instructions;

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
        return Instructions.OPCODE_F2I;
    }
}
