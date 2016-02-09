package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class baload extends Instruction {

    public static final String IDENTIFIER = "baload";
    private static final int    OPCODE   = 0x33;

    public baload() {
        super(IDENTIFIER, OPCODE);
    }
}
