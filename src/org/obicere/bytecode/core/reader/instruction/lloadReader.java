package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lload;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lloadReader implements Reader<lload> {

    @Override
    public lload read(final IndexedDataInputStream input) throws IOException {
        return new lload(input.readUnsignedByte());
    }
}