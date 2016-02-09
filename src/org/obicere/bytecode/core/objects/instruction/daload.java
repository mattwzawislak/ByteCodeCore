package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class daload extends Instruction {

    public static final String IDENTIFIER = "daload";
    private static final int    OPCODE   = 0x31;

    public daload() {
        super(IDENTIFIER, OPCODE);
    }
}
