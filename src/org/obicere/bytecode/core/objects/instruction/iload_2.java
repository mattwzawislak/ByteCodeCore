package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iload_2 extends Instruction {

    public static final String IDENTIFIER = "iload_2";
    private static final int    OPCODE   = 0x1c;

    public iload_2() {
        super(IDENTIFIER, OPCODE);
    }
}
