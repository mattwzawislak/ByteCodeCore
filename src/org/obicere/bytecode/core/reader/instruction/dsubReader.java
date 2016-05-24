package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dsub;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dsubReader implements Reader<dsub> {

    @Override
    public dsub read(final IndexedDataInputStream input) throws IOException {
        return dsub.INSTANCE;
    }
}