package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.objects.label.Label;
import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lookupswitch extends Instruction {

    public static final String IDENTIFIER = "lookupswitch";

    private final Label defaultOffset;

    private final int npairs1;
    private final int npairs2;
    private final int npairs3;
    private final int npairs4;

    private final int[] matches;

    private final Label[] offsets;

    public lookupswitch(final Label defaultOffset, final int npairs1, final int npairs2, final int npairs3, final int npairs4, final int[] matches, final Label[] offsets) {
        this.defaultOffset = defaultOffset;

        this.npairs1 = npairs1;
        this.npairs2 = npairs2;
        this.npairs3 = npairs3;
        this.npairs4 = npairs4;

        this.matches = matches;
        this.offsets = offsets;
    }

    public Label getDefaultOffset() {
        return defaultOffset;
    }

    public int getNpairs1() {
        return npairs1;
    }

    public int getNpairs3() {
        return npairs3;
    }

    public int getNpairs2() {
        return npairs2;
    }

    public int getNpairs4() {
        return npairs4;
    }

    public int getNpairs() {
        return (npairs1 << 24) | (npairs2 << 16) | (npairs3 << 8) | npairs4;
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
