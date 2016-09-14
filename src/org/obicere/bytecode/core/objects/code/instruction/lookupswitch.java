package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.objects.code.block.label.Label;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lookupswitch extends Instruction {

    public static final String IDENTIFIER = "lookupswitch";

    private final Label defaultOffset;

    private final int[] matches;

    private final Label[] offsets;

    public lookupswitch(final Label defaultOffset, final int[] matches, final Label[] offsets) {
        if(matches.length != offsets.length) {
            throw new IllegalArgumentException("matches and offsets must have same number of entries.");
        }
        this.defaultOffset = defaultOffset;
        this.matches = matches;
        this.offsets = offsets;
    }

    public Label getDefaultOffset() {
        return defaultOffset;
    }

    public int[] getMatches() {
        return matches;
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
        return InstructionReader.OPCODE_LOOKUPSWITCH;
    }
}
