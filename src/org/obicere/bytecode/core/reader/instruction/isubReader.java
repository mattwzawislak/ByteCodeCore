package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.isub;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class isubReader implements Reader<isub> {

    @Override
    public isub read(final IndexedDataInputStream input) throws IOException {
        return isub.INSTANCE;
    }
}