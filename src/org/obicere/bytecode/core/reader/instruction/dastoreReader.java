package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dastore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dastoreReader implements Reader<dastore> {

    @Override
    public dastore read(final IndexedDataInputStream input) throws IOException {
        return new dastore();
    }
}