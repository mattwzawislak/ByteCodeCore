package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ldiv;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ldivReader implements Reader<ldiv> {

    @Override
    public ldiv read(final IndexedDataInputStream input) throws IOException {
        return new ldiv();
    }
}