package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iflt;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifltReader implements Reader<iflt> {

    @Override
    public iflt read(final IndexedDataInputStream input) throws IOException {
        return new iflt(input.readUnsignedByte(), input.readUnsignedByte());
    }
}