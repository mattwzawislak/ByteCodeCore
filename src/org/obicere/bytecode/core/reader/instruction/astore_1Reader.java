package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.astore_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astore_1Reader implements Reader<astore_1> {

    @Override
    public astore_1 read(final IndexedDataInputStream input) throws IOException {
        return astore_1.INSTANCE;
    }
}
