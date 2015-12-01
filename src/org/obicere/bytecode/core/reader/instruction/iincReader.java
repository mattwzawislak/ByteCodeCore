package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iinc;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iincReader implements Reader<iinc> {

    @Override
    public iinc read(final IndexedDataInputStream input) throws IOException {
        return new iinc(input.readUnsignedByte(), input.readUnsignedByte());
    }
}