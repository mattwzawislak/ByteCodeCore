package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lor extends Instruction {

    public static final String IDENTIFIER = "lor";
    private static final int    OPCODE   = 0x81;

    public lor() {
        super(IDENTIFIER, OPCODE);
    }
}
