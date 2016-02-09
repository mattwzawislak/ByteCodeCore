package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class imul extends Instruction {

    public static final String IDENTIFIER = "imul";
    private static final int    OPCODE   = 0x74;

    public imul() {
        super(IDENTIFIER, OPCODE);
    }
}
