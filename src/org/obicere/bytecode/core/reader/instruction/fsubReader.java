package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fsub;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fsubReader implements Reader<fsub> {

    @Override
    public fsub read(final IndexedDataInputStream input) throws IOException {
        return fsub.INSTANCE;
    }
}