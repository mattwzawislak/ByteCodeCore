package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iadd extends Instruction {

    public static final String IDENTIFIER = "iadd";
    private static final int    OPCODE   = 0x60;

    public iadd() {
        super(IDENTIFIER, OPCODE);
    }
}
