package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iconst_0 extends Instruction {

    public static final String IDENTIFIER = "iconst_0";
    private static final int    OPCODE   = 0x03;

    public iconst_0() {
        super(IDENTIFIER, OPCODE);
    }
}
