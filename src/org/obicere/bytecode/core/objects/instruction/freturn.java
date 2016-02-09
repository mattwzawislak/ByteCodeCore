package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class freturn extends Instruction {

    public static final String IDENTIFIER = "freturn";
    private static final int    OPCODE   = 0xae;

    public freturn() {
        super(IDENTIFIER, OPCODE);
    }
}
