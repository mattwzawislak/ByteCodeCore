package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantInteger;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantIntegerReader implements Reader<ConstantInteger> {
    @Override
    public ConstantInteger read(final IndexedDataInputStream input) throws IOException {
        return new ConstantInteger(input.readInt());
    }
}
