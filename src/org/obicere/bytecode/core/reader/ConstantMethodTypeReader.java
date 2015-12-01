package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantMethodType;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantMethodTypeReader implements Reader<ConstantMethodType> {
    @Override
    public ConstantMethodType read(final IndexedDataInputStream input) throws IOException {
        return new ConstantMethodType(input.readUnsignedShort());
    }
}
