package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fcmpl extends Instruction {

    public static final String IDENTIFIER = "fcmpl";
    private static final int    OPCODE   = 0x95;

    public fcmpl() {
        super(IDENTIFIER, OPCODE);
    }
}
