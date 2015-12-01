package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.bastore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class bastoreReader implements Reader<bastore> {

    @Override
    public bastore read(final IndexedDataInputStream input) throws IOException {
        return new bastore();
    }
}
