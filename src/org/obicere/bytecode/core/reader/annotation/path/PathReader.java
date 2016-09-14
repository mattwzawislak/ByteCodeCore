package org.obicere.bytecode.core.reader.annotation.path;

import org.obicere.bytecode.core.objects.annotation.path.Path;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class PathReader implements Reader<Path> {
    @Override
    public Path read(final ByteCodeReader input) throws IOException {
        final int typePathKind = input.readUnsignedByte();
        final int typeArgumentIndex = input.readUnsignedByte();
        return new Path(typePathKind, typeArgumentIndex);
    }
}
