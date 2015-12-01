package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.saload;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class saloadReader implements Reader<saload> {

    @Override
    public saload read(final IndexedDataInputStream input) throws IOException {
        return new saload();
    }
}