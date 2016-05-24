package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iconst_3;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_3Reader implements Reader<iconst_3> {

    @Override
    public iconst_3 read(final IndexedDataInputStream input) throws IOException {
        return iconst_3.INSTANCE;
    }
}