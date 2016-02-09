package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iconst_m1 extends Instruction {

    public static final String IDENTIFIER = "iconst_m1";
    private static final int    OPCODE   = 0x02;

    public iconst_m1() {
        super(IDENTIFIER, OPCODE);
    }
}
