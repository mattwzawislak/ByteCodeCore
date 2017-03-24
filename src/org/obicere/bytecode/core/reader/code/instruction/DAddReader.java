package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DAdd;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDAdd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DAddReader implements Reader<DAdd> {

    @Override
    public DAdd read(final ByteCodeReader input) throws IOException {
        return DefaultDAdd.INSTANCE;
    }
}