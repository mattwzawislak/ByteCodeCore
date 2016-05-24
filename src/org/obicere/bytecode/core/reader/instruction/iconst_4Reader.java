package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iconst_4;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_4Reader implements Reader<iconst_4> {

    @Override
    public iconst_4 read(final IndexedDataInputStream input) throws IOException {
        return iconst_4.INSTANCE;
    }
}