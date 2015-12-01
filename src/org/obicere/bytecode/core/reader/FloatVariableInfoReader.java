package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.FloatVariableInfo;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 */
public class FloatVariableInfoReader implements Reader<FloatVariableInfo> {
    @Override
    public FloatVariableInfo read(final IndexedDataInputStream input) throws IOException {
        return new FloatVariableInfo(input.readUnsignedByte());
    }
}
