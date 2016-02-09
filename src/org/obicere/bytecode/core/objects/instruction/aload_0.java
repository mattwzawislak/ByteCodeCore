package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class aload_0 extends Instruction {

    public static final  String IDENTIFIER = "aload_0";
    private static final int    OPCODE     = 0x2a;

    public aload_0() {
        super(IDENTIFIER, OPCODE);
    }
}
