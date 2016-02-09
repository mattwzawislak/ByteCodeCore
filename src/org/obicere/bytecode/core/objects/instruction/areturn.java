package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class areturn extends Instruction {

    public static final String IDENTIFIER = "areturn";
    private static final int    OPCODE   = 0xb0;

    public areturn() {
        super(IDENTIFIER, OPCODE);
    }
}
