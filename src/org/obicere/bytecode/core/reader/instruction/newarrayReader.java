package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.newarray;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class newarrayReader implements Reader<newarray> {

    @Override
    public newarray read(final IndexedDataInputStream input) throws IOException {
        return new newarray(input.readUnsignedByte());
    }
}