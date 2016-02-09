package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class astore_3 extends Instruction {

    public static final String IDENTIFIER = "astore_3";
    private static final int    OPCODE   = 0x4e;

    public astore_3() {
        super(IDENTIFIER, OPCODE);
    }
}
