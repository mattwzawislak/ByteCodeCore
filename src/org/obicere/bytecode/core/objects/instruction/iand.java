package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iand extends Instruction {

    public static final String IDENTIFIER = "iand";
    private static final int    OPCODE   = 0x7e;

    public iand() {
        super(IDENTIFIER, OPCODE);
    }
}
