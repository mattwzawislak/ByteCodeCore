package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.invokevirtual;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokevirtualReader implements Reader<invokevirtual> {

    @Override
    public invokevirtual read(final IndexedDataInputStream input) throws IOException {
        return new invokevirtual(input.readUnsignedByte(), input.readUnsignedByte());
    }
}