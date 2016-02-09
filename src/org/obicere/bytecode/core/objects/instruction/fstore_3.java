package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fstore_3 extends Instruction {

    public static final String IDENTIFIER = "fstore_3";
    private static final int    OPCODE   = 0x46;

    public fstore_3() {
        super(IDENTIFIER, OPCODE);
    }
}
