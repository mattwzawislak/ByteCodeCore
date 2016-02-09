package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class d2l extends Instruction {

    public static final String IDENTIFIER = "d2l";
    private static final int    OPCODE   = 0x8f;

    public d2l() {
        super(IDENTIFIER, OPCODE);
    }
}
