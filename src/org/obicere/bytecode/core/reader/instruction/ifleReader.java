package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ifle;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifleReader implements Reader<ifle> {
    @Override
    public ifle read(final IndexedDataInputStream input) throws IOException {
        return new ifle(input.readUnsignedByte(), input.readUnsignedByte());
    }
}