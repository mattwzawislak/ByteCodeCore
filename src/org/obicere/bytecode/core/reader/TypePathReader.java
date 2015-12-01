package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypePath;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class TypePathReader implements Reader<TypePath> {
    @Override
    public TypePath read(final IndexedDataInputStream input) throws IOException {
        final int pathLength = input.readUnsignedByte();
        final Path[] path = new Path[pathLength];
        for(int i = 0; i < pathLength; i++){
            final int typePathKind = input.readUnsignedByte();
            final int typeArgumentIndex = input.readUnsignedByte();
            path[i] = new Path(typePathKind, typeArgumentIndex);
        }
        return new TypePath(path);
    }
}
