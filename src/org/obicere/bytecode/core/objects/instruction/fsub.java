package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fsub extends Instruction {

    public static final String IDENTIFIER = "fsub";
    private static final int    OPCODE   = 0x66;

    public fsub() {
        super(IDENTIFIER, OPCODE);
    }
}
