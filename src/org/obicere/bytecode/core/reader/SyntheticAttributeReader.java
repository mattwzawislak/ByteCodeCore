package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.SyntheticAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SyntheticAttributeReader implements Reader<SyntheticAttribute> {

    private final SyntheticAttribute instance = new SyntheticAttribute();

    @Override
    public SyntheticAttribute read(final IndexedDataInputStream input) throws IOException {
        return instance;
    }
}
