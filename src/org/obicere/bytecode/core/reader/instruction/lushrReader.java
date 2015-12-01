package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lushr;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lushrReader implements Reader<lushr> {

    @Override
    public lushr read(final IndexedDataInputStream input) throws IOException {
        return new lushr();
    }
}