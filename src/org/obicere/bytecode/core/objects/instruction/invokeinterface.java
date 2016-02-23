package org.obicere.bytecode.core.objects.instruction;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Obicere
 */
public class invokeinterface extends Instruction {

    public static final String IDENTIFIER = "invokeinterface";
    private static final int    OPCODE   = 0xb9;

    private final int indexbyte1;
    private final int indexbyte2;
    private final int count;
    private final int byte4;

    public invokeinterface(final int indexbyte1, final int indexbyte2, final int count, final int byte4) {
        super(IDENTIFIER, OPCODE);
        if (count <= 0) {
            Logger.getGlobal().log(Level.WARNING, "count of invokeinterface must be positive");
        }
        if (byte4 != 0) {
            Logger.getGlobal().log(Level.WARNING, "byte 4 of invokeinterface was not 0");
        }
        this.indexbyte1 = indexbyte1;
        this.indexbyte2 = indexbyte2;
        this.count = count;
        this.byte4 = byte4;
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

    public int getCount() {
        return count;
    }

    public int getByte4(){
        return byte4;
    }
}
