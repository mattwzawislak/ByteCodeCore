package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FAdd;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFAdd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FAddReader implements Reader<FAdd> {

    @Override
    public FAdd read(final ByteCodeReader input) throws IOException {
        return DefaultFAdd.INSTANCE;
    }
}