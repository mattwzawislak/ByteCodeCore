package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class faload extends Instruction {

    public static final String IDENTIFIER = "faload";
    private static final int    OPCODE   = 0x30;

    public faload() {
        super(IDENTIFIER, OPCODE);
    }
}
