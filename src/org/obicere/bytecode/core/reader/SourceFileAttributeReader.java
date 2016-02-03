package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.SourceFileAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SourceFileAttributeReader implements Reader<SourceFileAttribute> {

    @Override
    public SourceFileAttribute read(final IndexedDataInputStream input) throws IOException {
        final int length = input.readInt();
        final int sourceFileIndex = input.readUnsignedShort();
        return new SourceFileAttribute(length, sourceFileIndex);
    }
}
