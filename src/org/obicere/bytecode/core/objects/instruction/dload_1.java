package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dload_1 extends Instruction {

    public static final String IDENTIFIER = "dload_1";
    private static final int    OPCODE   = 0x27;

    public dload_1() {
        super(IDENTIFIER, OPCODE);
    }
}
