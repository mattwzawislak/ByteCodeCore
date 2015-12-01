package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantClass;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantClassReader implements Reader<ConstantClass> {
    @Override
    public ConstantClass read(final IndexedDataInputStream input) throws IOException {
        return new ConstantClass(input.readUnsignedShort());
    }
}
