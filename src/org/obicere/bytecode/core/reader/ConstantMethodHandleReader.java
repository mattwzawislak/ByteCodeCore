package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantMethodHandle;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantMethodHandleReader implements Reader<ConstantMethodHandle> {
    @Override
    public ConstantMethodHandle read(final IndexedDataInputStream input) throws IOException {
        return new ConstantMethodHandle(input.readByte(), input.readUnsignedShort());
    }
}
