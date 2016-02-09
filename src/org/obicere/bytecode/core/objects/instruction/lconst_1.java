package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lconst_1 extends Instruction {

    public static final String IDENTIFIER = "lconst_1";
    private static final int    OPCODE   = 0x0a;

    public lconst_1() {
        super(IDENTIFIER, OPCODE);
    }
}
