package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dreturn;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dreturnReader implements Reader<dreturn> {

    @Override
    public dreturn read(final IndexedDataInputStream input) throws IOException {
        return dreturn.INSTANCE;
    }
}