package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lneg extends Instruction {

    public static final String IDENTIFIER = "lneg";
    private static final int    OPCODE   = 0x75;

    public lneg() {
        super(IDENTIFIER, OPCODE);
    }
}
