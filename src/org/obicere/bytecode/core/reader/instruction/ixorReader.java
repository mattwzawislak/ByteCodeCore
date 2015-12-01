package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ixor;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ixorReader implements Reader<ixor> {

    @Override
    public ixor read(final IndexedDataInputStream input) throws IOException {
        return new ixor();
    }
}