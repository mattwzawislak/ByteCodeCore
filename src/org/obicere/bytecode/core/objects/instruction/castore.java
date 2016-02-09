package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class castore extends Instruction {

    public static final String IDENTIFIER = "castore";
    private static final int    OPCODE   = 0x55;

    public castore() {
        super(IDENTIFIER, OPCODE);
    }
}
