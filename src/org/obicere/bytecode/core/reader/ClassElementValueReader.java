package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ClassElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ClassElementValueReader implements Reader<ClassElementValue> {
    @Override
    public ClassElementValue read(final IndexedDataInputStream input) throws IOException {
        return new ClassElementValue(input.readUnsignedShort());
    }
}
