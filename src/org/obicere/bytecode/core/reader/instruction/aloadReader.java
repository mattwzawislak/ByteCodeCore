package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.aload;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aloadReader implements Reader<aload> {
    @Override
    public aload read(final IndexedDataInputStream input) throws IOException {
        return new aload(input.readUnsignedByte());
    }
}
