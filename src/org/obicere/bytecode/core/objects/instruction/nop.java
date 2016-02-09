package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class nop extends Instruction {

    public static final String IDENTIFIER = "nop";
    private static final int    OPCODE   = 0x00;

    public nop() {
        super(IDENTIFIER, OPCODE);
    }
}
