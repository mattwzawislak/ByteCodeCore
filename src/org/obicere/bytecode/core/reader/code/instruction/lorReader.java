package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLOr;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lorReader implements Reader<DefaultLOr> {

    @Override
    public DefaultLOr read(final ByteCodeReader input) throws IOException {
        return DefaultLOr.INSTANCE;
    }
}