package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fconst_2 extends Instruction {

    public static final String IDENTIFIER = "fconst_2";
    private static final int    OPCODE   = 0x0d;

    public fconst_2() {
        super(IDENTIFIER, OPCODE);
    }
}
