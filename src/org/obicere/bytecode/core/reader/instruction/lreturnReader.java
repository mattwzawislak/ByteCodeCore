package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lreturn;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lreturnReader implements Reader<lreturn> {

    @Override
    public lreturn read(final IndexedDataInputStream input) throws IOException {
        return lreturn.INSTANCE;
    }
}