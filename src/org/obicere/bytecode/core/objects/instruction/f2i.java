package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class f2i extends Instruction {

    public static final String IDENTIFIER = "f2i";
    private static final int    OPCODE   = 0x8b;

    public f2i() {
        super(IDENTIFIER, OPCODE);
    }
}
