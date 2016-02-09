package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fstore_0 extends Instruction {

    public static final String IDENTIFIER = "fstore_0";
    private static final int    OPCODE   = 0x43;

    public fstore_0() {
        super(IDENTIFIER, OPCODE);
    }
}
