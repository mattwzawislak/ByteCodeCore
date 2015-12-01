package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.laload;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class laloadReader implements Reader<laload> {

    @Override
    public laload read(final IndexedDataInputStream input) throws IOException {
        return new laload();
    }
}