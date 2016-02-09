package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ixor extends Instruction {

    public static final String IDENTIFIER = "ixor";
    private static final int    OPCODE   = 0x82;

    public ixor() {
        super(IDENTIFIER, OPCODE);
    }
}
