package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dload_3 extends Instruction {

    public static final String IDENTIFIER = "dload_3";
    private static final int    OPCODE   = 0x29;

    public dload_3() {
        super(IDENTIFIER, OPCODE);
    }
}
