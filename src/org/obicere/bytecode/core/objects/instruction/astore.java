package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class astore extends Instruction {

    public static final String IDENTIFIER = "astore";
    private static final int    OPCODE   = 0x3a;

    private final int index;

    public astore(final int index) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
