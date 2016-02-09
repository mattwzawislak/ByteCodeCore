package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lastore extends Instruction {

    public static final String IDENTIFIER = "lastore";
    private static final int    OPCODE   = 0x50;

    public lastore() {
        super(IDENTIFIER, OPCODE);
    }
}
