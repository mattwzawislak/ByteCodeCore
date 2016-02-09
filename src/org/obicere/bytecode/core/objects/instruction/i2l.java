package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class i2l extends Instruction {

    public static final String IDENTIFIER = "i2l";
    private static final int    OPCODE   = 0x85;

    public i2l() {
        super(IDENTIFIER, OPCODE);
    }
}
