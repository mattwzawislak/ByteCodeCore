package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.land;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class landReader implements Reader<land> {

    @Override
    public land read(final IndexedDataInputStream input) throws IOException {
        return land.INSTANCE;
    }
}