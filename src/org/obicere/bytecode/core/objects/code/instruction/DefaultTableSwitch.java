package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.TableSwitch;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultTableSwitch extends AbstractInstruction implements TableSwitch {

    public static final String MNEMONIC = "tableswitch";

    private final Label defaultOffset;

    private final int low;

    private final int high;

    private final Label[] offsets;

    public DefaultTableSwitch(final Label defaultOffset, final int low, final int high, final Label[] offsets) {
        this.defaultOffset = defaultOffset;
        this.low = low;
        this.high = high;
        this.offsets = offsets;
    }

    @Override
    public Label getDefault() {
        return defaultOffset;
    }

    @Override
    public int getLow() {
        return low;
    }

    @Override
    public int getHigh() {
        return high;
    }

    public Label[] getOffsets() {
        return offsets;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_TABLESWITCH;
    }

}
