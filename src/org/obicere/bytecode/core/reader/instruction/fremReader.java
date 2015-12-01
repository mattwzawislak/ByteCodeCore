package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.frem;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fremReader implements Reader<frem> {

    @Override
    public frem read(final IndexedDataInputStream input) throws IOException {
        return new frem();
    }
}