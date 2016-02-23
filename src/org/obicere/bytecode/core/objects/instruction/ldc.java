package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ldc extends Instruction {

    public static final String IDENTIFIER = "ldc";
    private static final int    OPCODE   = 0x12;

    private final int index;

    public ldc(final int index) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
