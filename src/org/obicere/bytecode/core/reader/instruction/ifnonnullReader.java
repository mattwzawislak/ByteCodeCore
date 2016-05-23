package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ifnonnull;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifnonnullReader implements Reader<ifnonnull> {

    @Override
    public ifnonnull read(final IndexedDataInputStream input) throws IOException {
        final int index = input.getIndex() - 1;
        return new ifnonnull(input.readLabel(index));
    }
}