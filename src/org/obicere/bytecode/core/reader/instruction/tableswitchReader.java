package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.tableswitch;
import org.obicere.bytecode.core.objects.label.Label;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class tableswitchReader implements Reader<tableswitch> {

    @Override
    public tableswitch read(final IndexedDataInputStream input) throws IOException {
        // subtract 1 to get index of the opcode
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

        final int lowbyte1 = input.readUnsignedByte();
        final int lowbyte2 = input.readUnsignedByte();
        final int lowbyte3 = input.readUnsignedByte();
        final int lowbyte4 = input.readUnsignedByte();
        final int highbyte1 = input.readUnsignedByte();
        final int highbyte2 = input.readUnsignedByte();
        final int highbyte3 = input.readUnsignedByte();
        final int highbyte4 = input.readUnsignedByte();

        final int low = (lowbyte1 << 24) | (lowbyte2 << 16) | (lowbyte3 << 8) | lowbyte4;
        final int high = (highbyte1 << 24) | (highbyte2 << 16) | (highbyte3 << 8) | highbyte4;
        final int jumps = high - low + 1;

        final Label[] offsets = new Label[jumps];
        for(int i = 0; i < jumps; i++){
            offsets[i] = input.readWideLabel(index);
        }
        return new tableswitch(defaultOffset, lowbyte1, lowbyte2, lowbyte3, lowbyte4, highbyte1, highbyte2, highbyte3, highbyte4, offsets);
    }
}