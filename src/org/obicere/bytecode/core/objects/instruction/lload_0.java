package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lload_0 extends Instruction {

    public static final String IDENTIFIER = "lload_0";
    private static final int    OPCODE   = 0x1e;

    public lload_0() {
        super(IDENTIFIER, OPCODE);
    }
}
