package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ishr extends Instruction {

    public static final String IDENTIFIER = "ishr";
    private static final int    OPCODE   = 0x7a;

    public ishr() {
        super(IDENTIFIER, OPCODE);
    }
}
