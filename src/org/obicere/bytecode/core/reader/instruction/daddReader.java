package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dadd;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class daddReader implements Reader<dadd> {

    @Override
    public dadd read(final IndexedDataInputStream input) throws IOException {
        return new dadd();
    }
}