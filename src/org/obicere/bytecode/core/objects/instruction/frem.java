package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class frem extends Instruction {

    public static final String IDENTIFIER = "frem";
    private static final int    OPCODE   = 0x72;

    public frem() {
        super(IDENTIFIER, OPCODE);
    }
}
