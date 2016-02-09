package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iconst_4 extends Instruction {

    public static final String IDENTIFIER = "iconst_4";
    private static final int    OPCODE   = 0x07;

    public iconst_4() {
        super(IDENTIFIER, OPCODE);
    }
}
