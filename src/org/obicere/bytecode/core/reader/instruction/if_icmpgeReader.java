package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.if_icmpge;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_icmpgeReader implements Reader<if_icmpge> {

    @Override
    public if_icmpge read(final IndexedDataInputStream input) throws IOException {
        final int index = input.getIndex() - 1;
        return new if_icmpge(input.readLabel(index));
    }
}