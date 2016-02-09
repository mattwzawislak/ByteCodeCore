package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dstore_1 extends Instruction {

    public static final String IDENTIFIER = "dstore_1";
    private static final int    OPCODE   = 0x48;

    public dstore_1() {
        super(IDENTIFIER, OPCODE);
    }
}
