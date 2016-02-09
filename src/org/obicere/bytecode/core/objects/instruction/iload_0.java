package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iload_0 extends Instruction {

    public static final String IDENTIFIER = "iload_0";
    private static final int    OPCODE   = 0x1a;

    public iload_0() {
        super(IDENTIFIER, OPCODE);
    }
}
