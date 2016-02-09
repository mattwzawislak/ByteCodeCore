package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dadd extends Instruction {

    public static final String IDENTIFIER = "dadd";
    private static final int    OPCODE   = 0x63;

    public dadd() {
        super(IDENTIFIER, OPCODE);
    }
}
