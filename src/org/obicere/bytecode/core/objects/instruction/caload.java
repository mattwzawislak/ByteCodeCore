package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class caload extends Instruction {

    public static final String IDENTIFIER = "caload";
    private static final int    OPCODE   = 0x34;

    public caload() {
        super(IDENTIFIER, OPCODE);
    }
}
