package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iushr;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iushrReader implements Reader<iushr> {

    @Override
    public iushr read(final IndexedDataInputStream input) throws IOException {
        return iushr.INSTANCE;
    }
}