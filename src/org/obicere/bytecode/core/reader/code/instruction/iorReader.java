package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIOr;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iorReader implements Reader<DefaultIOr> {

    @Override
    public DefaultIOr read(final ByteCodeReader input) throws IOException {
        return DefaultIOr.INSTANCE;
    }
}