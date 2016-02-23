package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ret extends Instruction {

    public static final String IDENTIFIER = "ret";
    private static final int    OPCODE   = 0xa9;

    private final int index;

    public ret(final int index) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
