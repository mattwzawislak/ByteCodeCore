package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class sipush extends Instruction {

    public static final String IDENTIFIER = "sipush";
    private static final int    OPCODE   = 0x11;

    private final int byte1;
    private final int byte2;

    public sipush(final int byte1, final int byte2) {
        super(IDENTIFIER, OPCODE);
        this.byte1 = byte1;
        this.byte2 = byte2;
    }

    public int getByte1(){
        return byte1;
    }

    public int getByte2(){
        return byte2;
    }

    public int getValue(){
        return (byte1 << 8) | byte2;
    }
}
