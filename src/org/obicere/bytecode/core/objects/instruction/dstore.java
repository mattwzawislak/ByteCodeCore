package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dstore extends Instruction {

    public static final  String IDENTIFIER = "dstore";
    private static final int    OPCODE     = 0x39;

    private final int index;

    public dstore(final int index) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
