package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lushr;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lushrReader implements Reader<lushr> {

    @Override
    public lushr read(final ByteCodeReader input) throws IOException {
        return lushr.INSTANCE;
    }
}