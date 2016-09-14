package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.i2f;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2fReader implements Reader<i2f> {

    @Override
    public i2f read(final ByteCodeReader input) throws IOException {
        return i2f.INSTANCE;
    }
}