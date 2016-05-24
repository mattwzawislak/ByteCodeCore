package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ddiv;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ddivReader implements Reader<ddiv> {

    @Override
    public ddiv read(final IndexedDataInputStream input) throws IOException {
        return ddiv.INSTANCE;
    }
}