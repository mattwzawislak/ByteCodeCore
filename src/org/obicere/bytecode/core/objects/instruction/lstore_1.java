package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lstore_1 extends Instruction {

    public static final String IDENTIFIER = "lstore_1";
    private static final int    OPCODE   = 0x40;

    public lstore_1() {
        super(IDENTIFIER, OPCODE);
    }
}
