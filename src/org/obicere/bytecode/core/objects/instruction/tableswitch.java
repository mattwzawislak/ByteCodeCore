package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.objects.label.Label;
import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class tableswitch extends Instruction {

    public static final String IDENTIFIER = "tableswitch";

    private final Label defaultOffset;

    private final int lowbyte1;
    private final int lowbyte2;
    private final int lowbyte3;
    private final int lowbyte4;

    private final int highbyte1;
    private final int highbyte2;
    private final int highbyte3;
    private final int highbyte4;

    private final Label[] offsets;

    public tableswitch(final Label defaultOffset, final int lowbyte1, final int lowbyte2, final int lowbyte3, final int lowbyte4, final int highbyte1, final int highbyte2, final int highbyte3, final int highbyte4, final Label[] offsets) {
        this.defaultOffset = defaultOffset;

        this.lowbyte1 = lowbyte1;
        this.lowbyte2 = lowbyte2;
        this.lowbyte3 = lowbyte3;
        this.lowbyte4 = lowbyte4;

        this.highbyte1 = highbyte1;
        this.highbyte2 = highbyte2;
        this.highbyte3 = highbyte3;
        this.highbyte4 = highbyte4;

        this.offsets = offsets;
    }

    public Label getDefaultOffset() {
        return defaultOffset;
    }

    public int getLowbyte1() {
        return lowbyte1;
    }

    public int getLowbyte2() {
        return lowbyte2;
    }

    public int getLowbyte3() {
        return lowbyte3;
    }

    public int getLowbyte4() {
        return lowbyte4;
    }

    public int getLow() {
        return (lowbyte1 << 24) | (lowbyte2 << 16) | (lowbyte3 << 8) | lowbyte4;
    }

    public int getHighbyte1() {
        return highbyte1;
    }

    public int getHighbyte2() {
        return highbyte2;
    }

    public int getHighbyte3() {
        return highbyte3;
    }

    public int getHighbyte4() {
        return highbyte4;
    }

    public int getHigh() {
        return (highbyte1 << 24) | (highbyte2 << 16) | (highbyte3 << 8) | highbyte4;
    }

    public Label[] getOffsets() {
        return offsets;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_TABLESWITCH;
    }

}
