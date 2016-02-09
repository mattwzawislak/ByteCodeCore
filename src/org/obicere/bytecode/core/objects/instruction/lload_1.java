package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lload_1 extends Instruction {

    public static final String IDENTIFIER = "lload_1";
    private static final int    OPCODE   = 0x1f;

    public lload_1() {
        super(IDENTIFIER, OPCODE);
    }
}
