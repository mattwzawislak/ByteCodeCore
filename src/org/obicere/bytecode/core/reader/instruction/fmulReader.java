package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fmul;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fmulReader implements Reader<fmul> {

    @Override
    public fmul read(final IndexedDataInputStream input) throws IOException {
        return new fmul();
    }
}