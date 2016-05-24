package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.faload;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class faloadReader implements Reader<faload> {

    @Override
    public faload read(final IndexedDataInputStream input) throws IOException {
        return faload.INSTANCE;
    }
}