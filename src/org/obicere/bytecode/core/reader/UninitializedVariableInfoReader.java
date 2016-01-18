package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.UninitializedVariableInfo;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 */
public class UninitializedVariableInfoReader implements Reader<UninitializedVariableInfo> {
    @Override
    public UninitializedVariableInfo read(final IndexedDataInputStream input) throws IOException {
        return new UninitializedVariableInfo(input.readUnsignedShort());
    }
}
