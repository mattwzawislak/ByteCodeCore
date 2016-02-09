package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class monitorexit extends Instruction {

    public static final String IDENTIFIER = "monitorexit";
    private static final int    OPCODE   = 0xc3;

    public monitorexit() {
        super(IDENTIFIER, OPCODE);
    }
}
