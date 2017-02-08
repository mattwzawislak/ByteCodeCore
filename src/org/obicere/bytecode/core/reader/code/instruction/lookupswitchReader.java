package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.block.label.Label;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLookupSwitch;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lookupswitchReader implements Reader<DefaultLookupSwitch> {

    @Override
    public DefaultLookupSwitch read(final ByteCodeReader input) throws IOException {
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

        final int numberPairs = input.readInt();

        final int[] matches = new int[numberPairs];
        final Label[] offsets  = new Label[numberPairs];

        for(int i = 0; i < numberPairs; i++){
            matches[i] = input.readInt();
            offsets[i] = input.readWideLabel(index);
        }
        return new DefaultLookupSwitch(defaultOffset, matches, offsets);
    }
}