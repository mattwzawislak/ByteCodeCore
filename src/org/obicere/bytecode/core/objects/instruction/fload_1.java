package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fload_1 extends Instruction {

    public static final String IDENTIFIER = "fload_1";
    private static final int    OPCODE   = 0x23;

    public fload_1() {
        super(IDENTIFIER, OPCODE);
    }
}
