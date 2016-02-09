package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fstore_2 extends Instruction {

    public static final String IDENTIFIER = "fstore_2";
    private static final int    OPCODE   = 0x45;

    public fstore_2() {
        super(IDENTIFIER, OPCODE);
    }
}
