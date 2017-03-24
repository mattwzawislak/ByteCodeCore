package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.LookupSwitch;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLookupSwitch;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LookupSwitchReader implements Reader<LookupSwitch> {

    @Override
    public LookupSwitch read(final ByteCodeReader input) throws IOException {
        // subtract 1 to get index of opcode
        final int index = input.getIndex() - 1;
        // how many bytes to skip to get to next index divisible by 4
        switch(input.getIndex() % 4) {
            case 1:
                input.readByte();
            case 2:
                input.readByte();
            case 3:
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