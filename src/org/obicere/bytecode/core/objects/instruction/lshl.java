package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lshl extends Instruction {

    public static final String IDENTIFIER = "lshl";
    private static final int    OPCODE   = 0x79;

    public lshl() {
        super(IDENTIFIER, OPCODE);
    }
}
