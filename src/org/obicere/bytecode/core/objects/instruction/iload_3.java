package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iload_3 extends Instruction {

    public static final String IDENTIFIER = "iload_3";
    private static final int    OPCODE   = 0x1d;

    public iload_3() {
        super(IDENTIFIER, OPCODE);
    }
}
