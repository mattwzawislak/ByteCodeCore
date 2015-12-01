package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.putfield;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class putfieldReader implements Reader<putfield> {

    @Override
    public putfield read(final IndexedDataInputStream input) throws IOException {
        return new putfield(input.readUnsignedByte(), input.readUnsignedByte());
    }
}