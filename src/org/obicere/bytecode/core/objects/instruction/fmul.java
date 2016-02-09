package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fmul extends Instruction {

    public static final String IDENTIFIER = "fmul";
    private static final int    OPCODE   = 0x6a;

    public fmul() {
        super(IDENTIFIER, OPCODE);
    }
}
