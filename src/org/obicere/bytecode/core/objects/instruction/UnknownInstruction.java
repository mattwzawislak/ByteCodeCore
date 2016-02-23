package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public final class UnknownInstruction extends Instruction {

    public static final String IDENTIFIER = "unknown";

    public UnknownInstruction(final int opcode){
        super(IDENTIFIER, opcode);
    }
}
