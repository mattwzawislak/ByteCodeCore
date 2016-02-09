package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lload_2 extends Instruction {

    public static final String IDENTIFIER = "lload_2";
    private static final int    OPCODE   = 0x20;

    public lload_2() {
        super(IDENTIFIER, OPCODE);
    }
}
