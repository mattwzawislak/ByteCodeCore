package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class istore extends Instruction {

    public static final String IDENTIFIER = "istore";
    private static final int    OPCODE   = 0x36;

    private final int index;

    public istore(final int index) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
