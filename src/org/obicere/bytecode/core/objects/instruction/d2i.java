package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class d2i extends Instruction {

    public static final String IDENTIFIER = "d2i";
    private static final int    OPCODE   = 0x8e;

    public d2i() {
        super(IDENTIFIER, OPCODE);
    }
}
