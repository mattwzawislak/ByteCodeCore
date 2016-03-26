package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Obicere
 */
public class invokedynamic extends Instruction {

    public static final  String IDENTIFIER = "invokedynamic";

    private final int indexbyte1;
    private final int indexbyte2;
    private final int byte3;
    private final int byte4;

    public invokedynamic(final int indexbyte1, final int indexbyte2, final int byte3, final int byte4) {
        if (byte3 != 0) {
            Logger.getGlobal().log(Level.WARNING, "byte 3 of invokedynamic was not 0");
        }
        if (byte4 != 0) {
            Logger.getGlobal().log(Level.WARNING, "byte 4 of invokedynamic was not 0");
        }
        this.indexbyte1 = indexbyte1;
        this.indexbyte2 = indexbyte2;
        this.byte3 = byte3;
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

    public int getByte3() {
        return byte3;
    }

    public int getByte4() {
        return byte4;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_INVOKEDYNAMIC;
    }
}
