package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.l2f;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class l2fReader implements Reader<l2f> {

    @Override
    public l2f read(final IndexedDataInputStream input) throws IOException {
        return new l2f();
    }
}