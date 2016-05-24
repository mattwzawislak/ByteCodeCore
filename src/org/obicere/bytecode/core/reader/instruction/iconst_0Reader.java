package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iconst_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_0Reader implements Reader<iconst_0> {

    @Override
    public iconst_0 read(final IndexedDataInputStream input) throws IOException {
        return iconst_0.INSTANCE;
    }
}