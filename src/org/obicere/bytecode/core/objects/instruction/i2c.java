package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class i2c extends Instruction {

    public static final String IDENTIFIER = "i2c";
    private static final int    OPCODE   = 0x92;

    public i2c() {
        super(IDENTIFIER, OPCODE);
    }
}
