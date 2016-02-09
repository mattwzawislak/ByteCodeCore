package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iconst_1 extends Instruction {

    public static final String IDENTIFIER = "iconst_1";
    private static final int    OPCODE   = 0x04;

    public iconst_1() {
        super(IDENTIFIER, OPCODE);
    }
}
