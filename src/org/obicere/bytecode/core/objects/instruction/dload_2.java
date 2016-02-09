package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dload_2 extends Instruction {

    public static final String IDENTIFIER = "dload_2";
    private static final int    OPCODE   = 0x28;

    public dload_2() {
        super(IDENTIFIER, OPCODE);
    }
}
