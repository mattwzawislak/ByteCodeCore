package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lstore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstore_3Reader implements Reader<lstore_3> {

    @Override
    public lstore_3 read(final ByteCodeReader input) throws IOException {
        return lstore_3.INSTANCE;
    }
}