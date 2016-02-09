package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iaload extends Instruction {

    public static final String IDENTIFIER = "iaload";
    private static final int    OPCODE   = 0x2e;

    public iaload() {
        super(IDENTIFIER, OPCODE);
    }
}
