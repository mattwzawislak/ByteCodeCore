package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ldiv extends Instruction {

    public static final String IDENTIFIER = "ldiv";
    private static final int    OPCODE   = 0x6d;

    public ldiv() {
        super(IDENTIFIER, OPCODE);
    }
}
