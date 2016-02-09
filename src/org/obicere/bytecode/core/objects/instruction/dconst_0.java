package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dconst_0 extends Instruction {

    public static final String IDENTIFIER = "dconst_0";
    private static final int    OPCODE   = 0x0e;

    public dconst_0() {
        super(IDENTIFIER, OPCODE);
    }
}
