package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.checkcast;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class checkcastReader implements Reader<checkcast> {

    @Override
    public checkcast read(final IndexedDataInputStream input) throws IOException {
        return new checkcast(input.readUnsignedByte(), input.readUnsignedByte());
    }
}
