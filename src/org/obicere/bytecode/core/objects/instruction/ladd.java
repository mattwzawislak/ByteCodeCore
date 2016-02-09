package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ladd extends Instruction {

    public static final String IDENTIFIER = "ladd";
    private static final int    OPCODE   = 0x61;

    public ladd() {
        super(IDENTIFIER, OPCODE);
    }
}
