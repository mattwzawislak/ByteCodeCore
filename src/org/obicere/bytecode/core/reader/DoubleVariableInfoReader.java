package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.DoubleVariableInfo;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 */
public class DoubleVariableInfoReader implements Reader<DoubleVariableInfo> {
    @Override
    public DoubleVariableInfo read(final IndexedDataInputStream input) throws IOException {
        return new DoubleVariableInfo(input.readUnsignedByte());
    }
}
