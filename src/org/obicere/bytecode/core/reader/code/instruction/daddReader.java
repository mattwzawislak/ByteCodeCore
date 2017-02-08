package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDAdd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class daddReader implements Reader<DefaultDAdd> {

    @Override
    public DefaultDAdd read(final ByteCodeReader input) throws IOException {
        return DefaultDAdd.INSTANCE;
    }
}