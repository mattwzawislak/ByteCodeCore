package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.objects.code.block.label.Label;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class tableswitch extends Instruction {

    public static final String IDENTIFIER = "tableswitch";

    private final Label defaultOffset;

    private final int low;

    private final int high;

    private final Label[] offsets;

    public tableswitch(final Label defaultOffset, final int low, final int high, final Label[] offsets) {
        this.defaultOffset = defaultOffset;
        this.low = low;
        this.high = high;
        this.offsets = offsets;
    }

    public Label getDefaultOffset() {
        return defaultOffset;
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
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
