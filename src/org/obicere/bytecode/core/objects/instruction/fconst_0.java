package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fconst_0 extends Instruction {

    public static final String IDENTIFIER = "fconst_0";
    private static final int    OPCODE   = 0x0b;

    public fconst_0() {
        super(IDENTIFIER, OPCODE);
    }
}
