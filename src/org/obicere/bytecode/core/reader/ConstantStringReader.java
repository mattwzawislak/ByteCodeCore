package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantString;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantStringReader implements Reader<ConstantString> {
    @Override
    public ConstantString read(final IndexedDataInputStream input) throws IOException {
        return new ConstantString(input.readUnsignedShort());
    }
}
