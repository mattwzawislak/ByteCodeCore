package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.newarray;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class newarrayReader implements Reader<newarray> {

    @Override
    public newarray read(final ByteCodeReader input) throws IOException {
        return new newarray(input.readUnsignedByte());
    }
}