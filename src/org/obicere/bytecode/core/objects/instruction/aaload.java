package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class aaload extends Instruction {

    public static final  String IDENTIFIER = "aaload";
    private static final int    OPCODE     = 0x32;

    public aaload() {
        super(IDENTIFIER, OPCODE);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
