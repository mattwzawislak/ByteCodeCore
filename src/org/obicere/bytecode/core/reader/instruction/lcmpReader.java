package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lcmp;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lcmpReader implements Reader<lcmp> {

    @Override
    public lcmp read(final IndexedDataInputStream input) throws IOException {
        return new lcmp();
    }
}