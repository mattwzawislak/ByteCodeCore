package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iadd;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iaddReader implements Reader<iadd> {

    @Override
    public iadd read(final IndexedDataInputStream input) throws IOException {
        return iadd.INSTANCE;
    }
}