package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iushr extends Instruction {

    public static final String IDENTIFIER = "iushr";
    private static final int    OPCODE   = 0x7c;

    public iushr() {
        super(IDENTIFIER, OPCODE);
    }
}
