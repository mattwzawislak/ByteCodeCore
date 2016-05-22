package org.obicere.bytecode.core.reader.target;

import org.obicere.bytecode.core.objects.target.CatchTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class CatchTargetReader implements Reader<CatchTarget> {
    @Override
    public CatchTarget read(final IndexedDataInputStream input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int exceptionTableIndex = input.readUnsignedShort();
        return new CatchTarget(targetType, exceptionTableIndex);
    }
}
