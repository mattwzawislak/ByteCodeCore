package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iload_1 extends Instruction {

    public static final String IDENTIFIER = "iload_1";
    private static final int    OPCODE   = 0x1b;

    public iload_1() {
        super(IDENTIFIER, OPCODE);
    }
}
