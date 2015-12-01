package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.istore_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istore_1Reader implements Reader<istore_1> {

    @Override
    public istore_1 read(final IndexedDataInputStream input) throws IOException {
        return new istore_1();
    }
}