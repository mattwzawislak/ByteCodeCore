package org.obicere.bytecode.core.reader.annotation.path;

import org.obicere.bytecode.core.objects.annotation.path.Path;
import org.obicere.bytecode.core.objects.annotation.path.TypePath;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class TypePathReader implements Reader<TypePath> {

    private final PathReader reader = new PathReader();

    @Override
    public TypePath read(final ByteCodeReader input) throws IOException {
        final int pathLength = input.readUnsignedByte();
        final Path[] path = new Path[pathLength];
        for (int i = 0; i < pathLength; i++) {
            path[i] = reader.read(input);
        }
        return new TypePath(path);
    }
}
