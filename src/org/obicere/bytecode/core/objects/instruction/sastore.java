package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class sastore extends Instruction {

    public static final String IDENTIFIER = "sastore";
    private static final int    OPCODE   = 0x56;

    public sastore() {
        super(IDENTIFIER, OPCODE);
    }
}
