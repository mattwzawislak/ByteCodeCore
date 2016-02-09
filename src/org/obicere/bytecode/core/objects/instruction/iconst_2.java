package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iconst_2 extends Instruction {

    public static final String IDENTIFIER = "iconst_2";
    private static final int    OPCODE   = 0x05;

    public iconst_2() {
        super(IDENTIFIER, OPCODE);
    }
}
