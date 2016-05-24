package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.istore_3;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istore_3Reader implements Reader<istore_3> {

    @Override
    public istore_3 read(final IndexedDataInputStream input) throws IOException {
        return istore_3.INSTANCE;
    }
}