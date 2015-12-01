package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.d2i;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class d2iReader implements Reader<d2i> {

    @Override
    public d2i read(final IndexedDataInputStream input) throws IOException {
        return new d2i();
    }
}