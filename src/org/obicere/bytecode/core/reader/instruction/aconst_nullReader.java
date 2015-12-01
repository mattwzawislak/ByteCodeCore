package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.aconst_null;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aconst_nullReader implements Reader<aconst_null> {

    @Override
    public aconst_null read(final IndexedDataInputStream input) throws IOException {
        return new aconst_null();
    }
}
