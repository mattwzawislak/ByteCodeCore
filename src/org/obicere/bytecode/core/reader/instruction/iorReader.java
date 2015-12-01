package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ior;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iorReader implements Reader<ior> {

    @Override
    public ior read(final IndexedDataInputStream input) throws IOException {
        return new ior();
    }
}