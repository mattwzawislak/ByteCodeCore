package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fadd extends Instruction {

    public static final String IDENTIFIER = "fadd";
    private static final int    OPCODE   = 0x62;

    public fadd() {
        super(IDENTIFIER, OPCODE);
    }
}
