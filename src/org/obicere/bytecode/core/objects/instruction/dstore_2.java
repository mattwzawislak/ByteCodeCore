package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dstore_2 extends Instruction {

    public static final String IDENTIFIER = "dstore_2";
    private static final int    OPCODE   = 0x49;

    public dstore_2() {
        super(IDENTIFIER, OPCODE);
    }
}
