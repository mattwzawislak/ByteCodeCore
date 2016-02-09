package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dconst_1 extends Instruction {

    public static final String IDENTIFIER = "dconst_1";
    private static final int    OPCODE   = 0x0f;

    public dconst_1() {
        super(IDENTIFIER, OPCODE);
    }
}
