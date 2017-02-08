package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLAdd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class laddReader implements Reader<DefaultLAdd> {

    @Override
    public DefaultLAdd read(final ByteCodeReader input) throws IOException {
        return DefaultLAdd.INSTANCE;
    }
}