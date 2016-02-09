package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dup2_x1 extends Instruction {

    public static final String IDENTIFIER = "dup2_x1";
    private static final int    OPCODE   = 0x5d;

    public dup2_x1() {
        super(IDENTIFIER, OPCODE);
    }
}
