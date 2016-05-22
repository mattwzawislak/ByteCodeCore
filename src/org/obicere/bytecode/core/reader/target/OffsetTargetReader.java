package org.obicere.bytecode.core.reader.target;

import org.obicere.bytecode.core.objects.target.OffsetTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class OffsetTargetReader implements Reader<OffsetTarget> {
    @Override
    public OffsetTarget read(final IndexedDataInputStream input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int offset = input.readUnsignedShort();
        return new OffsetTarget(targetType, offset);
    }
}
