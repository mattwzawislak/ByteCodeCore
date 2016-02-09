package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class istore_1 extends Instruction {

    public static final String IDENTIFIER = "istore_1";
    private static final int    OPCODE   = 0x3c;

    public istore_1() {
        super(IDENTIFIER, OPCODE);
    }
}
