package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.instanceof_;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class instanceofReader implements Reader<instanceof_> {

    @Override
    public instanceof_ read(final IndexedDataInputStream input) throws IOException {
        return new instanceof_(input.readUnsignedByte(), input.readUnsignedByte());
    }
}