package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class athrow extends Instruction {

    public static final String IDENTIFIER = "athrow";
    private static final int    OPCODE   = 0xbf;

    public athrow() {
        super(IDENTIFIER, OPCODE);
    }
}
