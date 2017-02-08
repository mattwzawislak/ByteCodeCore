package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultArrayLength;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class arraylengthReader implements Reader<DefaultArrayLength> {

    @Override
    public DefaultArrayLength read(final ByteCodeReader input) throws IOException {
        return DefaultArrayLength.INSTANCE;
    }
}
