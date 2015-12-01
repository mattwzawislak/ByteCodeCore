package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantFloat;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantFloatReader implements Reader<ConstantFloat> {
    @Override
    public ConstantFloat read(final IndexedDataInputStream input) throws IOException {
        return new ConstantFloat(input.readFloat());
    }
}
