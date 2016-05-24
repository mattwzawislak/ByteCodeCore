package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.pop2;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class pop2Reader implements Reader<pop2> {

    @Override
    public pop2 read(final IndexedDataInputStream input) throws IOException {
        return pop2.INSTANCE;
    }
}