package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fstore extends Instruction {

    public static final String IDENTIFIER = "fstore";
    private static final int    OPCODE   = 0x38;

    private final int index;

    public fstore(final int index) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
