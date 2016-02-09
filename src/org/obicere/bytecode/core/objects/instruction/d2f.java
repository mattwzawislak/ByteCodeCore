package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class d2f extends Instruction {

    public static final String IDENTIFIER = "d2f";
    private static final int    OPCODE   = 0x90;

    public d2f() {
        super(IDENTIFIER, OPCODE);
    }
}
