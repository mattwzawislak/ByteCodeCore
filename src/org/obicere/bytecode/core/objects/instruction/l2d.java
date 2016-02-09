package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class l2d extends Instruction {

    public static final String IDENTIFIER = "l2d";
    private static final int    OPCODE   = 0x8a;

    public l2d() {
        super(IDENTIFIER, OPCODE);
    }
}
