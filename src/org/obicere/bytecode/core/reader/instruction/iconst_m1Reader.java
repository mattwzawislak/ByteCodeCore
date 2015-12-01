package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iconst_m1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_m1Reader implements Reader<iconst_m1> {

    @Override
    public iconst_m1 read(final IndexedDataInputStream input) throws IOException {
        return new iconst_m1();
    }
}