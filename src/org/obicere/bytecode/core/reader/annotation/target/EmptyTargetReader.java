package org.obicere.bytecode.core.reader.annotation.target;

import org.obicere.bytecode.core.objects.annotation.target.EmptyTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class EmptyTargetReader implements Reader<EmptyTarget> {
    @Override
    public EmptyTarget read(final ByteCodeReader input) throws IOException {
        return new EmptyTarget(input.readUnsignedByte());
    }
}
