package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class aconst_null extends Instruction {

    public static final  String IDENTIFIER = "aconst_null";
    private static final int    OPCODE     = 0x01;

    public aconst_null() {
        super(IDENTIFIER, OPCODE);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
