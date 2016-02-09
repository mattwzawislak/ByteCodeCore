package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dup2 extends Instruction {

    public static final String IDENTIFIER = "dup2";
    private static final int    OPCODE   = 0x5c;

    public dup2() {
        super(IDENTIFIER, OPCODE);
    }
}
