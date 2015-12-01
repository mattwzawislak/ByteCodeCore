package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ifgt;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifgtReader implements Reader<ifgt> {

    @Override
    public ifgt read(final IndexedDataInputStream input) throws IOException {
        return new ifgt(input.readUnsignedByte(), input.readUnsignedByte());
    }
}