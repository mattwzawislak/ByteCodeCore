package org.obicere.bytecode.core.objects.code.instruction;

/**
 * @author Obicere
 */
public final class UnknownInstruction extends Instruction {

    public static final String IDENTIFIER = "unknown";

    private final byte opcode;

    public UnknownInstruction(final byte opcode){
        this.opcode = opcode;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return opcode;
    }
}
