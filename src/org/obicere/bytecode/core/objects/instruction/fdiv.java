package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fdiv extends Instruction {

    public static final String IDENTIFIER = "fdiv";
    private static final int    OPCODE   = 0x6e;

    public fdiv() {
        super(IDENTIFIER, OPCODE);
    }
}
