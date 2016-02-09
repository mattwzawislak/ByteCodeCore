package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class pop2 extends Instruction {

    public static final String IDENTIFIER = "pop2";
    private static final int    OPCODE   = 0x58;

    public pop2() {
        super(IDENTIFIER, OPCODE);
    }
}
