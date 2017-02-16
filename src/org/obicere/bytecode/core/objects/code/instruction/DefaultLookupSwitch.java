package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.LookupSwitch;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLookupSwitch extends AbstractInstruction implements LookupSwitch {

    public static final String MNEMONIC = "lookupswitch";

    private final Label defaultOffset;

    private final int[] matches;

    private final Label[] offsets;

    public DefaultLookupSwitch(final Label defaultOffset, final int[] matches, final Label[] offsets) {
        if (matches.length != offsets.length) {
            throw new IllegalArgumentException("matches and offsets must have same number of entries.");
        }
        this.defaultOffset = defaultOffset;
        this.matches = matches;
        this.offsets = offsets;
    }

    @Override
    public int getLength(final int pc) {
        final int padding = (4 - (pc % 4)) % 4;
        final int offsetSizes = 8 * getNumberOfPairs();
        // 1 - byte for lookupswitch opcode
        // padding - bytes to word-align offsets
        // 8 - default, and npairs
        // offsetSizes - the size of the match-offset pairs
        //     (8 bytes per pair)
        return 1 + padding + 8 + offsetSizes;
    }

    @Override
    public Label getDefault() {
        return defaultOffset;
    }

    @Override
    public int getNumberOfPairs() {
        // assert matches.length == offsets.length
        return matches.length;
    }

    @Override
    public int[] getMatches() {
        return matches;
    }

    @Override
    public Label[] getOffsets() {
        return offsets;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LOOKUPSWITCH;
    }
}
