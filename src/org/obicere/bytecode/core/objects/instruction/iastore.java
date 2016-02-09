package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iastore extends Instruction {

    public static final String IDENTIFIER = "iastore";
    private static final int    OPCODE   = 0x4f;

    public iastore() {
        super(IDENTIFIER, OPCODE);
    }
}
