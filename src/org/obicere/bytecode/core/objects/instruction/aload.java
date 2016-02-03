package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class aload extends Instruction {

    public static final  String IDENTIFIER = "aload";
    private static final int    OPCODE     = 0x19;

    private final int index;

    public aload(final int index) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

}
