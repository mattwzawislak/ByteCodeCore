package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class i2s extends Instruction {

    public static final String IDENTIFIER = "i2s";
    private static final int    OPCODE   = 0x93;

    public i2s() {
        super(IDENTIFIER, OPCODE);
    }
}
