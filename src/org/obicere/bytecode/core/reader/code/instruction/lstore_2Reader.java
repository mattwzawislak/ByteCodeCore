package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lstore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstore_2Reader implements Reader<lstore_2> {

    @Override
    public lstore_2 read(final ByteCodeReader input) throws IOException {
        return lstore_2.INSTANCE;
    }
}