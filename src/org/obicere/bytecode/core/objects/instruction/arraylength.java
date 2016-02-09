package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class arraylength extends Instruction {

    public static final String IDENTIFIER = "arraylength";
    private static final int    OPCODE   = 0xbe;

    public arraylength() {
        super(IDENTIFIER, OPCODE);
    }
}
