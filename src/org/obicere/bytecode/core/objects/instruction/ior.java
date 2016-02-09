package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ior extends Instruction {

    public static final String IDENTIFIER = "ior";
    private static final int    OPCODE   = 0x80;

    public ior() {
        super(IDENTIFIER, OPCODE);
    }
}
