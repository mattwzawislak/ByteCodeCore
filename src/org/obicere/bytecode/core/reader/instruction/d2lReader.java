package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.d2l;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class d2lReader implements Reader<d2l> {

    @Override
    public d2l read(final IndexedDataInputStream input) throws IOException {
        return new d2l();
    }
}