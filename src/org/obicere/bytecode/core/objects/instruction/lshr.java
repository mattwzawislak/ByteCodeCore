package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lshr extends Instruction {

    public static final String IDENTIFIER = "lshr";
    private static final int    OPCODE   = 0x7b;

    public lshr() {
        super(IDENTIFIER, OPCODE);
    }
}
