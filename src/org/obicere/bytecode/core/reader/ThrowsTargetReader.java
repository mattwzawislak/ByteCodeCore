package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ThrowsTarget;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ThrowsTargetReader implements Reader<ThrowsTarget> {
    @Override
    public ThrowsTarget read(final IndexedDataInputStream input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int throwsTypeIndex = input.readUnsignedShort();
        return new ThrowsTarget(targetType, throwsTypeIndex);
    }
}
