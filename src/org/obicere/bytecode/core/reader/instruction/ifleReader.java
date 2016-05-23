package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ifle;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifleReader implements Reader<ifle> {
    @Override
    public ifle read(final IndexedDataInputStream input) throws IOException {
        final int index = input.getIndex() - 1;
        return new ifle(input.readLabel(index));
    }
}