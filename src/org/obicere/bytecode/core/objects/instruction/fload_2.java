package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fload_2 extends Instruction {

    public static final String IDENTIFIER = "fload_2";
    private static final int    OPCODE   = 0x24;

    public fload_2() {
        super(IDENTIFIER, OPCODE);
    }
}
