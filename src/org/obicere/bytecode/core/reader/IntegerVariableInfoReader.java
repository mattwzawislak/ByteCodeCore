package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.IntegerVariableInfo;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 */
public class IntegerVariableInfoReader implements Reader<IntegerVariableInfo> {

    @Override
    public IntegerVariableInfo read(final IndexedDataInputStream input) throws IOException {
        return new IntegerVariableInfo(input.readUnsignedByte());
    }
}
