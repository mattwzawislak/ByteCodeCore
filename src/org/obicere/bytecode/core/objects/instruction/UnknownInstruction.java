package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public final class UnknownInstruction extends Instruction {

    public static final String IDENTIFIER = "unknown";
    private static final int OPCODE = -1;

    public UnknownInstruction(){
        super(IDENTIFIER, OPCODE);
    }
}
