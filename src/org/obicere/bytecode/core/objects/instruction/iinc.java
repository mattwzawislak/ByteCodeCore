package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iinc extends Instruction {

    public static final String IDENTIFIER = "iinc";
    private static final int    OPCODE   = 0x84;

    private final int index;
    private final int constant;

    public iinc(final int index, final int constant) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
        this.constant = constant;
    }

    public int getIndex() {
        return index;
    }

    public int getConstant() {
        return constant;
    }
}
