package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class f2d extends Instruction {

    public static final String IDENTIFIER = "f2d";
    private static final int    OPCODE   = 0x8d;

    public f2d() {
        super(IDENTIFIER, OPCODE);
    }
}
