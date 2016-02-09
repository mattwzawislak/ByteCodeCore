package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class monitorenter extends Instruction {

    public static final String IDENTIFIER = "monitorenter";
    private static final int    OPCODE   = 0xc2;

    public monitorenter() {
        super(IDENTIFIER, OPCODE);
    }
}
