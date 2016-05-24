package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lshr;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lshrReader implements Reader<lshr> {

    @Override
    public lshr read(final IndexedDataInputStream input) throws IOException {
        return lshr.INSTANCE;
    }
}