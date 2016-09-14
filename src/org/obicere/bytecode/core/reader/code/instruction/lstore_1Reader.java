package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lstore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstore_1Reader implements Reader<lstore_1> {

    @Override
    public lstore_1 read(final ByteCodeReader input) throws IOException {
        return lstore_1.INSTANCE;
    }
}