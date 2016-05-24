package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.astore_3;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astore_3Reader implements Reader<astore_3> {

    @Override
    public astore_3 read(final IndexedDataInputStream input) throws IOException {
        return astore_3.INSTANCE;
    }
}
