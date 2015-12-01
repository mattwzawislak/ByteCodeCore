package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.drem;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dremReader implements Reader<drem> {

    @Override
    public drem read(final IndexedDataInputStream input) throws IOException {
        return new drem();
    }
}