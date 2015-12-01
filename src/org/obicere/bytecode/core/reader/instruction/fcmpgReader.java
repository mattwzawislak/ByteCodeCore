package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fcmpg;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fcmpgReader implements Reader<fcmpg> {

    @Override
    public fcmpg read(final IndexedDataInputStream input) throws IOException {
        return new fcmpg();
    }
}