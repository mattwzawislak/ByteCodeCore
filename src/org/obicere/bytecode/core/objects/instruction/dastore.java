package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dastore extends Instruction {

    public static final String IDENTIFIER = "dastore";
    private static final int    OPCODE   = 0x52;

    public dastore() {
        super(IDENTIFIER, OPCODE);
    }
}
