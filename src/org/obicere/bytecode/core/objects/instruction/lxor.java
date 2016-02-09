package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lxor extends Instruction {

    public static final String IDENTIFIER = "lxor";
    private static final int    OPCODE   = 0x83;

    public lxor() {
        super(IDENTIFIER, OPCODE);
    }
}
