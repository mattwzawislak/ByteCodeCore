package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ddiv extends Instruction {

    public static final String IDENTIFIER = "ddiv";
    private static final int    OPCODE   = 0x6f;

    public ddiv() {
        super(IDENTIFIER, OPCODE);
    }
}
