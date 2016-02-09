package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class isub extends Instruction {

    public static final String IDENTIFIER = "isub";
    private static final int    OPCODE   = 0x64;

    public isub() {
        super(IDENTIFIER, OPCODE);
    }
}
