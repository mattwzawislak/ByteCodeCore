package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.LocalVar;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVarReader implements Reader<LocalVar> {
    @Override
    public LocalVar read(final IndexedDataInputStream input) throws IOException {
        final int startPC = input.readUnsignedShort();
        final int length = input.readUnsignedShort();
        final int index = input.readUnsignedShort();
        return new LocalVar(startPC, length, index);
    }
}
