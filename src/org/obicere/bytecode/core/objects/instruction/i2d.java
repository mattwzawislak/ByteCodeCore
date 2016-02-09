package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class i2d extends Instruction {

    public static final String IDENTIFIER = "i2d";
    private static final int    OPCODE   = 0x87;

    public i2d() {
        super(IDENTIFIER, OPCODE);
    }
}
