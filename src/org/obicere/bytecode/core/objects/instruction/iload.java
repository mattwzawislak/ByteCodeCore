package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iload extends Instruction {

    public static final String IDENTIFIER = "iload";
    private static final int    OPCODE   = 0x15;

    private final int index;

    public iload(final int index) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
    }

    public int getIndex(){
        return index;
    }
}
