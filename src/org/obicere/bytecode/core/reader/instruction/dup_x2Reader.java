package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dup_x2;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dup_x2Reader implements Reader<dup_x2> {

    @Override
    public dup_x2 read(final IndexedDataInputStream input) throws IOException {
        return dup_x2.INSTANCE;
    }
}