package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ineg extends Instruction {

    public static final String IDENTIFIER = "ineg";
    private static final int    OPCODE   = 0x74;

    public ineg() {
        super(IDENTIFIER, OPCODE);
    }
}
