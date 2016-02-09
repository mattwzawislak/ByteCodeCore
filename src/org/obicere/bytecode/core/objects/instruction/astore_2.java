package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class astore_2 extends Instruction {

    public static final String IDENTIFIER = "astore_2";
    private static final int    OPCODE   = 0x4d;

    public astore_2() {
        super(IDENTIFIER, OPCODE);
    }
}
