package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dup_x1 extends Instruction {

    public static final String IDENTIFIER = "dup_x1";
    private static final int    OPCODE   = 0x5a;

    public dup_x1() {
        super(IDENTIFIER, OPCODE);
    }
}
