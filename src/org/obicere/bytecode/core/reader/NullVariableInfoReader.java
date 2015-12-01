package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.NullVariableInfo;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 */
public class NullVariableInfoReader implements Reader<NullVariableInfo> {
    @Override
    public NullVariableInfo read(final IndexedDataInputStream input) throws IOException {
        return new NullVariableInfo(input.readUnsignedByte());
    }
}
