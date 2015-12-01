package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.getfield;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class getfieldReader implements Reader<getfield> {

    @Override
    public getfield read(final IndexedDataInputStream input) throws IOException {
        return new getfield(input.readUnsignedByte(), input.readUnsignedByte());
    }
}