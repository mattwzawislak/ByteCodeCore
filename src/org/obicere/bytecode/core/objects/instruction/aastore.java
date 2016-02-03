package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class aastore extends Instruction {

    public static final  String IDENTIFIER = "aastore";
    private static final int    OPCODE     = 0x53;

    public aastore() {
        super(IDENTIFIER, OPCODE);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
