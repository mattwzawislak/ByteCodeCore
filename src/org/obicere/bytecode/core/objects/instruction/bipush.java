package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class bipush extends Instruction {

    public static final String IDENTIFIER = "bipush";
    private static final int    OPCODE   = 0x10;

    private final byte value;

    public bipush(final byte value) {
        super(IDENTIFIER, OPCODE);
        this.value = value;
    }

    public byte getByte() {
        return value;
    }
}
