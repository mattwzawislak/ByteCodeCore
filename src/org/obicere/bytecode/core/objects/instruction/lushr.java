package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lushr extends Instruction {

    public static final String IDENTIFIER = "lushr";
    private static final int    OPCODE   = 0x7d;

    public lushr() {
        super(IDENTIFIER, OPCODE);
    }
}
