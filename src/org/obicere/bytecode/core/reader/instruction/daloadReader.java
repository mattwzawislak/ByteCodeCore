package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.daload;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class daloadReader implements Reader<daload> {

    @Override
    public daload read(final IndexedDataInputStream input) throws IOException {
        return daload.INSTANCE;
    }
}