package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.ILoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultILoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ILoadReader implements Reader<ILoad> {

    @Override
    public ILoad read(final ByteCodeReader input) throws IOException {
        return new DefaultILoad(input.readUnsignedByte());
    }
}