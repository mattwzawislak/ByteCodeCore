package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dup extends Instruction {

    public static final String IDENTIFIER = "dup";
    private static final int    OPCODE   = 0x59;

    public dup() {
        super(IDENTIFIER, OPCODE);
    }
}
