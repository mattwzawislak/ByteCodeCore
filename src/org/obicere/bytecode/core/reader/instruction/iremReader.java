package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.irem;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iremReader implements Reader<irem> {

    @Override
    public irem read(final IndexedDataInputStream input) throws IOException {
        return irem.INSTANCE;
    }
}