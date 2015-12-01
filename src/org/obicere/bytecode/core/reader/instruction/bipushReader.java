package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.bipush;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class bipushReader implements Reader<bipush> {

    @Override
    public bipush read(final IndexedDataInputStream input) throws IOException {
        return new bipush(input.readByte());
    }
}
