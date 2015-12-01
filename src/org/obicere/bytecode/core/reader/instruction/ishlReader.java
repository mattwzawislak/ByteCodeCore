package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ishl;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ishlReader implements Reader<ishl> {

    @Override
    public ishl read(final IndexedDataInputStream input) throws IOException {
        return new ishl();
    }
}