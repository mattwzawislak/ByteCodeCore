package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lmul;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lmulReader implements Reader<lmul> {

    @Override
    public lmul read(final IndexedDataInputStream input) throws IOException {
        return lmul.INSTANCE;
    }
}