package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ifne;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifneReader implements Reader<ifne> {

    @Override
    public ifne read(final IndexedDataInputStream input) throws IOException {
        return new ifne(input.readUnsignedByte(), input.readUnsignedByte());
    }
}