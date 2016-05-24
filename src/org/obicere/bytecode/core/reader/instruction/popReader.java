package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.pop;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class popReader implements Reader<pop> {

    @Override
    public pop read(final IndexedDataInputStream input) throws IOException {
        return pop.INSTANCE;
    }
}