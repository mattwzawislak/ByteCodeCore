package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dsub extends Instruction {

    public static final String IDENTIFIER = "dsub";
    private static final int    OPCODE   = 0x67;

    public dsub() {
        super(IDENTIFIER, OPCODE);
    }
}
