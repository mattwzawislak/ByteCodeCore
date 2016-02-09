package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ireturn extends Instruction {

    public static final String IDENTIFIER = "ireturn";
    private static final int    OPCODE   = 0xac;

    public ireturn() {
        super(IDENTIFIER, OPCODE);
    }
}
