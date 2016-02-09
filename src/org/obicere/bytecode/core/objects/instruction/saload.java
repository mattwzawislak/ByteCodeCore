package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class saload extends Instruction {

    public static final String IDENTIFIER = "saload";
    private static final int    OPCODE   = 0x35;

    public saload() {
        super(IDENTIFIER, OPCODE);
    }
}
