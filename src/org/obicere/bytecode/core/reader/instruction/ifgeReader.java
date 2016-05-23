package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ifge;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifgeReader implements Reader<ifge> {

    @Override
    public ifge read(final IndexedDataInputStream input) throws IOException {
        final int index = input.getIndex() - 1;
        return new ifge(input.readLabel(index));
    }
}