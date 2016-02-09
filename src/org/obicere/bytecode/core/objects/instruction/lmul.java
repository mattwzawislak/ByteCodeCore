package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lmul extends Instruction {

    public static final String IDENTIFIER = "lmul";
    private static final int    OPCODE   = 0x69;

    public lmul() {
        super(IDENTIFIER, OPCODE);
    }
}
