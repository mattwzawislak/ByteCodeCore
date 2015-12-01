package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public final class UnknownInstruction extends Instruction {

    private static final String MNEMONIC = "unknown";
    private static final int OPCODE = -1;

    public UnknownInstruction(){
        super(MNEMONIC, OPCODE);
    }
}
