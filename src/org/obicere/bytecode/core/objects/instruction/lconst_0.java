package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lconst_0 extends Instruction {

    public static final String IDENTIFIER = "lconst_0";
    private static final int    OPCODE   = 0x09;

    public lconst_0() {
        super(IDENTIFIER, OPCODE);
    }
}
