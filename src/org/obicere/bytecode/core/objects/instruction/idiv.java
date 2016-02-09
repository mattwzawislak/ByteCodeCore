package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class idiv extends Instruction {

    public static final String IDENTIFIER = "idiv";
    private static final int    OPCODE   = 0x6c;

    public idiv() {
        super(IDENTIFIER, OPCODE);
    }
}
