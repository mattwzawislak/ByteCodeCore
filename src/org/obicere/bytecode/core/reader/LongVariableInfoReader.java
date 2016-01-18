package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.LongVariableInfo;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 */
public class LongVariableInfoReader implements Reader<LongVariableInfo> {
    @Override
    public LongVariableInfo read(final IndexedDataInputStream input) throws IOException {
        return new LongVariableInfo();
    }
}
