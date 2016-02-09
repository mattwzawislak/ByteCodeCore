package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class istore_2 extends Instruction {

    public static final String IDENTIFIER = "istore_2";
    private static final int    OPCODE   = 0x3d;

    public istore_2() {
        super(IDENTIFIER, OPCODE);
    }
}
