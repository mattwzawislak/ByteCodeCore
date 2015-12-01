package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.baload;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class baloadReader implements Reader<baload> {

    @Override
    public baload read(final IndexedDataInputStream input) throws IOException {
        return new baload();
    }
}
