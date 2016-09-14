package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.l2f;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class l2fReader implements Reader<l2f> {

    @Override
    public l2f read(final ByteCodeReader input) throws IOException {
        return l2f.INSTANCE;
    }
}