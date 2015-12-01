package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.if_icmpeq;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_icmpeqReader implements Reader<if_icmpeq> {

    @Override
    public if_icmpeq read(final IndexedDataInputStream input) throws IOException {
        return new if_icmpeq(input.readUnsignedByte(), input.readUnsignedByte());
    }
}