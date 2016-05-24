package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dup2;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dup2Reader implements Reader<dup2> {

    @Override
    public dup2 read(final IndexedDataInputStream input) throws IOException {
        return dup2.INSTANCE;
    }
}