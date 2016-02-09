package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class i2b extends Instruction {

    public static final String IDENTIFIER = "i2b";
    private static final int    OPCODE   = 0x91;

    public i2b() {
        super(IDENTIFIER, OPCODE);
    }
}
