package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iconst_5 extends Instruction {

    public static final String IDENTIFIER = "iconst_5";
    private static final int    OPCODE   = 0x08;

    public iconst_5() {
        super(IDENTIFIER, OPCODE);
    }
}
