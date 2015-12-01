package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantFieldRef;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantFieldRefReader implements Reader<ConstantFieldRef> {
    @Override
    public ConstantFieldRef read(final IndexedDataInputStream input) throws IOException {
        return new ConstantFieldRef(input.readUnsignedShort(), input.readUnsignedShort());
    }
}
