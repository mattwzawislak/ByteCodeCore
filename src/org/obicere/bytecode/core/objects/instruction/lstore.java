package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lstore extends Instruction {

    public static final String IDENTIFIER = "lstore";
    private static final int    OPCODE   = 0x37;

    private final int index;

    public lstore(final int index) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
