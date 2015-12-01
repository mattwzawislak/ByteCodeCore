package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantDouble;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantDoubleReader implements Reader<ConstantDouble> {
    @Override
    public ConstantDouble read(final IndexedDataInputStream input) throws IOException {
        return new ConstantDouble(input.readDouble());
    }
}
