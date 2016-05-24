package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dcmpg;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dcmpgReader implements Reader<dcmpg> {

    @Override
    public dcmpg read(final IndexedDataInputStream input) throws IOException {
        return dcmpg.INSTANCE;
    }
}