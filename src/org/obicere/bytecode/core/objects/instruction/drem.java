package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class drem extends Instruction {

    public static final String IDENTIFIER = "drem";
    private static final int    OPCODE   = 0x73;

    public drem() {
        super(IDENTIFIER, OPCODE);
    }

}
