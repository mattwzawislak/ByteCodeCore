package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.putstatic;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class putstaticReader implements Reader<putstatic> {

    @Override
    public putstatic read(final IndexedDataInputStream input) throws IOException {
        return new putstatic(input.readUnsignedByte(), input.readUnsignedByte());
    }
}