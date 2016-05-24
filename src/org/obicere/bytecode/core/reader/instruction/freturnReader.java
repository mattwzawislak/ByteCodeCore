package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.freturn;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class freturnReader implements Reader<freturn> {

    @Override
    public freturn read(final IndexedDataInputStream input) throws IOException {
        return freturn.INSTANCE;
    }
}