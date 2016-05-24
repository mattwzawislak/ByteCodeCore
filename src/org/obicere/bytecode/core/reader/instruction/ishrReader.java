package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ishr;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ishrReader implements Reader<ishr> {

    @Override
    public ishr read(final IndexedDataInputStream input) throws IOException {
        return ishr.INSTANCE;
    }
}