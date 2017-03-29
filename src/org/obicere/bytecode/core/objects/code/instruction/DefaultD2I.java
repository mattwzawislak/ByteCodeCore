package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.D2I;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultD2I extends AbstractInstruction implements D2I {

    public static final String MNEMONIC = "d2i";

    public static final D2I INSTANCE = new DefaultD2I();

    private DefaultD2I() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_D2I;
    }
}
