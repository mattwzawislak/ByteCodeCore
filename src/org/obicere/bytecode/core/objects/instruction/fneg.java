package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fneg extends Instruction {

    public static final String IDENTIFIER = "fneg";
    private static final int    OPCODE   = 0x76;

    public fneg() {
        super(IDENTIFIER, OPCODE);
    }
}
