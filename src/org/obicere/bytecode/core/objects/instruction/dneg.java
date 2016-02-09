package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dneg extends Instruction {

    public static final String IDENTIFIER = "dneg";
    private static final int    OPCODE   = 0x77;

    public dneg() {
        super(IDENTIFIER, OPCODE);
    }
}
