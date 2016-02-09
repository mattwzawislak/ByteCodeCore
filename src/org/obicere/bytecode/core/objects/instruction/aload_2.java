package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class aload_2 extends Instruction {

    public static final String IDENTIFIER = "aload_2";
    private static final int    OPCODE   = 0x2c;

    public aload_2() {
        super(IDENTIFIER, OPCODE);
    }

}
