package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lstore_0 extends Instruction {

    public static final String IDENTIFIER = "lstore_0";
    private static final int    OPCODE   = 0x3f;

    public lstore_0() {
        super(IDENTIFIER, OPCODE);
    }
}
