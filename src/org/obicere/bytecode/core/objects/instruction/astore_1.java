package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class astore_1 extends Instruction {

    public static final String IDENTIFIER = "astore_1";
    private static final int    OPCODE   = 0x4c;

    public astore_1() {
        super(IDENTIFIER, OPCODE);
    }
}
