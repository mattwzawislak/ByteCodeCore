package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LAdd;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLAdd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LAddReader implements Reader<LAdd> {

    @Override
    public LAdd read(final ByteCodeReader input) throws IOException {
        return DefaultLAdd.INSTANCE;
    }
}