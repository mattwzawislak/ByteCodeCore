package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class irem extends Instruction {

    public static final String IDENTIFIER = "irem";
    private static final int    OPCODE   = 0x70;

    public irem() {
        super(IDENTIFIER, OPCODE);
    }
}
