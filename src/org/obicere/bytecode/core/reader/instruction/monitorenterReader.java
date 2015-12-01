package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.monitorenter;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class monitorenterReader implements Reader<monitorenter> {

    @Override
    public monitorenter read(final IndexedDataInputStream input) throws IOException {
        return new monitorenter();
    }
}