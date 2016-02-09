package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dload_0 extends Instruction {

    public static final String IDENTIFIER = "dload_0";
    private static final int    OPCODE   = 0x26;

    public dload_0() {
        super(IDENTIFIER, OPCODE);
    }
}
