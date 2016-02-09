package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class aload_1 extends Instruction {

    public static final String IDENTIFIER = "aload_1";
    private static final int    OPCODE   = 0x2b;

    public aload_1() {
        super(IDENTIFIER, OPCODE);
    }
}
