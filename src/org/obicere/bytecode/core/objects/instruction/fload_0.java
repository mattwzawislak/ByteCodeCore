package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fload_0 extends Instruction {

    public static final String IDENTIFIER = "fload_0";
    private static final int    OPCODE   = 0x22;

    public fload_0() {
        super(IDENTIFIER, OPCODE);
    }
}
