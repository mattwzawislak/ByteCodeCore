package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.d2f;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class d2fReader implements Reader<d2f> {

    @Override
    public d2f read(final IndexedDataInputStream input) throws IOException {
        return d2f.INSTANCE;
    }
}
