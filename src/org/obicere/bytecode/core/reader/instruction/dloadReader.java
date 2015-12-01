package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dload;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dloadReader implements Reader<dload> {
    @Override
    public dload read(final IndexedDataInputStream input) throws IOException {
        return new dload(input.readUnsignedByte());
    }
}