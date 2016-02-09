package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class f2l extends Instruction {

    public static final String IDENTIFIER = "f2l";
    private static final int    OPCODE   = 0x8c;

    public f2l() {
        super(IDENTIFIER, OPCODE);
    }
}
