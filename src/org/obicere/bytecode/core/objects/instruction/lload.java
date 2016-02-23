package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lload extends Instruction {

    public static final String IDENTIFIER = "lload";
    private static final int    OPCODE   = 0x16;

    private final int index;

    public lload(final int index) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
