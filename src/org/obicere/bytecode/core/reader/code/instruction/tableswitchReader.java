package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.block.label.Label;
import org.obicere.bytecode.core.objects.code.instruction.tableswitch;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class tableswitchReader implements Reader<tableswitch> {

    @Override
    public tableswitch read(final ByteCodeReader input) throws IOException {
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

        final int low = input.readInt();
        final int high = input.readInt();

        final int jumps = high - low + 1;

        final Label[] offsets = new Label[jumps];
        for(int i = 0; i < jumps; i++){
            offsets[i] = input.readWideLabel(index);
        }
        return new tableswitch(defaultOffset, low, high, offsets);
    }
}