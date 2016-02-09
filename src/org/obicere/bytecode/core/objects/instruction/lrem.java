package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lrem extends Instruction {

    public static final String IDENTIFIER = "lrem";
    private static final int    OPCODE   = 0x71;

    public lrem() {
        super(IDENTIFIER, OPCODE);
    }
}
