package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ret;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class retReader implements Reader<ret> {

    @Override
    public ret read(final IndexedDataInputStream input) throws IOException {
        return new ret(input.readUnsignedByte());
    }
}