package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.imul;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class imulReader implements Reader<imul> {

    @Override
    public imul read(final IndexedDataInputStream input) throws IOException {
        return new imul();
    }
}