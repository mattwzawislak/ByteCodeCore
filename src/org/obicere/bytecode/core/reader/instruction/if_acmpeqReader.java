package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.if_acmpeq;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_acmpeqReader implements Reader<if_acmpeq> {

    @Override
    public if_acmpeq read(final IndexedDataInputStream input) throws IOException {
        return new if_acmpeq(input.readUnsignedByte(), input.readUnsignedByte());
    }
}