package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ObjectVariableInfo;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 */
public class ObjectVariableInfoReader implements Reader<ObjectVariableInfo> {
    @Override
    public ObjectVariableInfo read(final IndexedDataInputStream input) throws IOException {
        return new ObjectVariableInfo(input.readUnsignedByte(), input.readUnsignedShort());
    }
}
