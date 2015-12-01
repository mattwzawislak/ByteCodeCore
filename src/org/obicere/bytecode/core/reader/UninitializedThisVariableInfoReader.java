package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.UninitializedThisVariableInfo;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 */
public class UninitializedThisVariableInfoReader implements Reader<UninitializedThisVariableInfo> {
    @Override
    public UninitializedThisVariableInfo read(final IndexedDataInputStream input) throws IOException {
        return new UninitializedThisVariableInfo(input.readUnsignedByte());
    }
}
