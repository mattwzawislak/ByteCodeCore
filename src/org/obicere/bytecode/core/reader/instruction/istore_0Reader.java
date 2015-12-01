package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.istore_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istore_0Reader implements Reader<istore_0> {

    @Override
    public istore_0 read(final IndexedDataInputStream input) throws IOException {
        return new istore_0();
    }
}