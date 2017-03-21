package org.obicere.bytecode.core.reader.annotation.target;

import org.javacore.annotation.target.EmptyTarget;
import org.obicere.bytecode.core.objects.annotation.target.DefaultEmptyTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class EmptyTargetReader implements Reader<EmptyTarget> {

    @Override
    public EmptyTarget read(final ByteCodeReader input) throws IOException {
        return new DefaultEmptyTarget(input.readUnsignedByte());
    }
}
