package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lstore_2 extends Instruction {

    public static final String IDENTIFIER = "lstore";
    private static final int    OPCODE   = 0x41;

    public lstore_2() {
        super(IDENTIFIER, OPCODE);
    }
}
