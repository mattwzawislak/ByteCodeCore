package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.TableSwitch;
import org.obicere.bytecode.core.objects.code.instruction.DefaultTableSwitch;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class TableSwitchReader implements Reader<TableSwitch> {

    @Override
    public TableSwitch read(final ByteCodeReader input) throws IOException {
        // subtract 1 to get index of the opcode
        final int index = input.getIndex() - 1;
        // how many bytes to skip to get to next index divisible by 4
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

        final int low = input.readInt();
        final int high = input.readInt();

        final int jumps = high - low + 1;

        final Label[] offsets = new Label[jumps];
        for(int i = 0; i < jumps; i++){
            offsets[i] = input.readWideLabel(index);
        }
        return new DefaultTableSwitch(defaultOffset, low, high, offsets);
    }
}