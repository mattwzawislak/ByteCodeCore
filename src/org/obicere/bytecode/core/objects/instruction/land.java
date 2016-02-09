package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class land extends Instruction {

    public static final String IDENTIFIER = "land";
    private static final int    OPCODE   = 0x7f;

    public land() {
        super(IDENTIFIER, OPCODE);
    }
}
