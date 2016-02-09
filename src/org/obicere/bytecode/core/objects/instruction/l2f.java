package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class l2f extends Instruction {

    public static final String IDENTIFIER = "l2f";
    private static final int    OPCODE   = 0x89;

    public l2f() {
        super(IDENTIFIER, OPCODE);
    }
}
