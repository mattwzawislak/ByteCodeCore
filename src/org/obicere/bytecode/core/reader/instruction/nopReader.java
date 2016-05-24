package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.nop;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class nopReader implements Reader<nop> {

    @Override
    public nop read(final IndexedDataInputStream input) throws IOException {
        return nop.INSTANCE;
    }
}