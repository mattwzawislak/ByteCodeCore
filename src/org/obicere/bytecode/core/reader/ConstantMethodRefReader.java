package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantMethodRef;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantMethodRefReader implements Reader<ConstantMethodRef> {
    @Override
    public ConstantMethodRef read(final IndexedDataInputStream input) throws IOException {
        return new ConstantMethodRef(input.readUnsignedShort(), input.readUnsignedShort());
    }
}
