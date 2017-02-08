package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFAdd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class faddReader implements Reader<DefaultFAdd> {

    @Override
    public DefaultFAdd read(final ByteCodeReader input) throws IOException {
        return DefaultFAdd.INSTANCE;
    }
}