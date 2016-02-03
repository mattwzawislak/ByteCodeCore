package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.EnclosingMethodAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class EnclosingMethodAttributeReader implements Reader<EnclosingMethodAttribute> {
    @Override
    public EnclosingMethodAttribute read(final IndexedDataInputStream input) throws IOException {
        final int length = input.readInt();
        final int classIndex = input.readUnsignedShort();
        final int methodIndex = input.readUnsignedShort();
        return new EnclosingMethodAttribute(length, classIndex, methodIndex);
    }
}
