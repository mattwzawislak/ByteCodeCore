package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class istore_3 extends Instruction {

    public static final String IDENTIFIER = "istore_3";
    private static final int    OPCODE   = 0x3e;

    public istore_3() {
        super(IDENTIFIER, OPCODE);
    }
}
