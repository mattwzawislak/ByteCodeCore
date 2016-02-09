package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class laload extends Instruction {

    public static final String IDENTIFIER = "laload";
    private static final int    OPCODE   = 0x2f;

    public laload() {
        super(IDENTIFIER, OPCODE);
    }
}
