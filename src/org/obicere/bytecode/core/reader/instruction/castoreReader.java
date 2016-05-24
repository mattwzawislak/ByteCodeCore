package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.castore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class castoreReader implements Reader<castore> {

    @Override
    public castore read(final IndexedDataInputStream input) throws IOException {
        return castore.INSTANCE;
    }
}
