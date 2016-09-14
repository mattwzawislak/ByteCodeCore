package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iload;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iloadReader implements Reader<iload> {

    @Override
    public iload read(final ByteCodeReader input) throws IOException {
        return new iload(input.readUnsignedByte());
    }
}