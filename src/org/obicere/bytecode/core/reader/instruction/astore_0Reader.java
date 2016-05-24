package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.astore_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astore_0Reader implements Reader<astore_0> {

    @Override
    public astore_0 read(final IndexedDataInputStream input) throws IOException {
        return astore_0.INSTANCE;
    }
}
