package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.aload;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aloadReader implements Reader<aload> {
    @Override
    public aload read(final ByteCodeReader input) throws IOException {
        return new aload(input.readUnsignedByte());
    }
}
