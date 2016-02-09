package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dmul extends Instruction {

    public static final String IDENTIFIER = "dmul";
    private static final int    OPCODE   = 0x6b;

    public dmul() {
        super(IDENTIFIER, OPCODE);
    }
}
