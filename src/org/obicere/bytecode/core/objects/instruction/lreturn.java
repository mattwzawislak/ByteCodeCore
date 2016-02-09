package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lreturn extends Instruction {

    public static final String IDENTIFIER = "lreturn";
    private static final int    OPCODE   = 0xad;

    public lreturn() {
        super(IDENTIFIER, OPCODE);
    }
}
