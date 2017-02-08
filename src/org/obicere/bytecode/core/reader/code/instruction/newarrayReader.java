package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultNewArray;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class newarrayReader implements Reader<DefaultNewArray> {

    @Override
    public DefaultNewArray read(final ByteCodeReader input) throws IOException {
        return new DefaultNewArray(input.readUnsignedByte());
    }
}