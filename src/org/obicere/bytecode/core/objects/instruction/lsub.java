package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lsub extends Instruction {

    public static final String IDENTIFIER = "lsub";
    private static final int    OPCODE   = 0x65;

    public lsub() {
        super(IDENTIFIER, OPCODE);
    }
}
