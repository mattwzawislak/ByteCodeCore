package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iconst_5;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_5Reader implements Reader<iconst_5> {

    @Override
    public iconst_5 read(final IndexedDataInputStream input) throws IOException {
        return new iconst_5();
    }
}