package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lookupswitch;
import org.obicere.bytecode.core.objects.label.Label;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lookupswitchReader implements Reader<lookupswitch> {

    @Override
    public lookupswitch read(final IndexedDataInputStream input) throws IOException {
        // subtract 1 to get index of opcode
        final int index = input.getIndex() - 1;
        // how many bytes to skip to toString to next index divisible by 4
        final int skip = (4 - (input.getIndex() % 4)) % 4;
        // let n = index % 4
        // n = 0, skip = 0
        // n = 1, skip = 3
        // n = 2, skip = 2
        // n = 3, skip = 1
        for(int i = 0; i < skip; i++){
            input.readByte();
        }
        final Label defaultOffset = input.readWideLabel(index);

        final int npairs1 = input.readUnsignedByte();
        final int npairs2 = input.readUnsignedByte();
        final int npairs3 = input.readUnsignedByte();
        final int npairs4 = input.readUnsignedByte();

        final int npairs = (npairs1 << 24) | (npairs2 << 16) | (npairs3 << 8) | npairs4;

        final int[] matches = new int[npairs];
        final Label[] offsets  = new Label[npairs];

        for(int i = 0; i < npairs; i++){
            matches[i] = input.readInt();
            offsets[i] = input.readWideLabel(index);
        }
        return new lookupswitch(defaultOffset, npairs1, npairs2, npairs3, npairs4, matches, offsets);
    }
}