package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ineg;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class inegReader implements Reader<ineg> {

    @Override
    public ineg read(final IndexedDataInputStream input) throws IOException {
        return ineg.INSTANCE;
    }
}