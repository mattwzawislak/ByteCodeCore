package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class astore_0 extends Instruction {

    public static final String IDENTIFIER = "astore_0";
    private static final int    OPCODE   = 0x4b;

    public astore_0() {
        super(IDENTIFIER, OPCODE);
    }
}
