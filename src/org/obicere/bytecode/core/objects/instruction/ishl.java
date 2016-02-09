package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ishl extends Instruction {

    public static final String IDENTIFIER = "ishl";
    private static final int    OPCODE   = 0x78;

    public ishl() {
        super(IDENTIFIER, OPCODE);
    }
}
