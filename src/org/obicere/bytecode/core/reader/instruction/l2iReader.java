package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.l2i;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class l2iReader implements Reader<l2i> {

    @Override
    public l2i read(final IndexedDataInputStream input) throws IOException {
        return new l2i();
    }
}