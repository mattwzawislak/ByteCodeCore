package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ifnull;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifnullReader implements Reader<ifnull> {

    @Override
    public ifnull read(final IndexedDataInputStream input) throws IOException {
        final int index = input.getIndex() - 1;
        return new ifnull(input.readLabel(index));
    }
}