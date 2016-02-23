package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ldc2_w extends Instruction {

    public static final String IDENTIFIER = "lcd2_w";
    private static final int    OPCODE   = 0x14;

    private final int indexbyte1;
    private final int indexbyte2;

    public ldc2_w(final int indexbyte1, final int indexbyte2) {
        super(IDENTIFIER, OPCODE);
        this.indexbyte1 = indexbyte1;
        this.indexbyte2 = indexbyte2;
    }

    public int getIndexbyte1() {
        return indexbyte1;
    }

    public int getIndexbyte2() {
        return indexbyte2;
    }

    public int getIndex() {
        return (indexbyte1 << 8) | indexbyte2;
    }
}
