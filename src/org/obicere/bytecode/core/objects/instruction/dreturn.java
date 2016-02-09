package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dreturn extends Instruction {

    public static final String IDENTIFIER = "dreturn";
    private static final int    OPCODE   = 0xaf;

    public dreturn() {
        super(IDENTIFIER, OPCODE);
    }
}
