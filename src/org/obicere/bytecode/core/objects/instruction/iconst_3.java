package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iconst_3 extends Instruction {

    public static final String IDENTIFIER = "iconst_3";
    private static final int    OPCODE   = 0x06;

    public iconst_3() {
        super(IDENTIFIER, OPCODE);
    }
}
