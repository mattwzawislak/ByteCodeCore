package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fastore extends Instruction {

    public static final String IDENTIFIER = "fastore";
    private static final int    OPCODE   = 0x51;

    public fastore() {
        super(IDENTIFIER, OPCODE);
    }
}
