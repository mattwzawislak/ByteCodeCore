package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fconst_1 extends Instruction {

    public static final String IDENTIFIER = "fconst_1";
    private static final int    OPCODE   = 0x0c;

    public fconst_1() {
        super(IDENTIFIER, OPCODE);
    }
}
