package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iaload;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ialoadReader implements Reader<iaload> {

    @Override
    public iaload read(final IndexedDataInputStream input) throws IOException {
        return new iaload();
    }
}