package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class bastore extends Instruction {

    public static final String IDENTIFIER = "bastore";
    private static final int    OPCODE   = 0x54;

    public bastore() {
        super(IDENTIFIER, OPCODE);
    }
}
