package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dcmpg extends Instruction {

    public static final String IDENTIFIER = "dcmpg";
    private static final int    OPCODE   = 0x98;

    public dcmpg() {
        super(IDENTIFIER, OPCODE);
    }
}
