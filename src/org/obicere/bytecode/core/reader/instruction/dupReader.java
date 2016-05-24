package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dup;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dupReader implements Reader<dup> {

    @Override
    public dup read(final IndexedDataInputStream input) throws IOException {
        return dup.INSTANCE;
    }
}