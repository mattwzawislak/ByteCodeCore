package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lstore_3 extends Instruction {

    public static final String IDENTIFIER = "lstore_3";
    private static final int    OPCODE   = 0x42;

    public lstore_3() {
        super(IDENTIFIER, OPCODE);
    }
}
