package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.DeprecatedAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DeprecatedAttributeReader implements Reader<DeprecatedAttribute> {

    private final DeprecatedAttribute instance = new DeprecatedAttribute();

    @Override
    public DeprecatedAttribute read(final IndexedDataInputStream input) throws IOException {
        return instance;
    }
}
