package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class istore_0 extends Instruction {

    public static final String IDENTIFIER = "istore_0";
    private static final int    OPCODE   = 0x3b;

    public istore_0() {
        super(IDENTIFIER, OPCODE);
    }
}
