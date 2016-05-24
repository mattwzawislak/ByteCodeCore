package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.f2i;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class f2iReader implements Reader<f2i> {

    @Override
    public f2i read(final IndexedDataInputStream input) throws IOException {
        return f2i.INSTANCE;
    }
}