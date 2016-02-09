package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dcmpl extends Instruction {

    public static final String IDENTIFIER = "dcmpl";
    private static final int    OPCODE   = 0x97;

    public dcmpl() {
        super(IDENTIFIER, OPCODE);
    }
}
