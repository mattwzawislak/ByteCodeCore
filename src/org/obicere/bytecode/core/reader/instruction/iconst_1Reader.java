package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iconst_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_1Reader implements Reader<iconst_1> {

    @Override
    public iconst_1 read(final IndexedDataInputStream input) throws IOException {
        return new iconst_1();
    }
}