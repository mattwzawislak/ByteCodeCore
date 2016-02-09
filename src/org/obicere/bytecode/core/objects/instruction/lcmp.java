package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lcmp extends Instruction {

    public static final String IDENTIFIER = "lcmp";
    private static final int    OPCODE   = 0x94;

    public lcmp() {
        super(IDENTIFIER, OPCODE);
    }
}
