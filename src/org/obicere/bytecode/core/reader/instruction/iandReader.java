package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iand;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iandReader implements Reader<iand> {

    @Override
    public iand read(final IndexedDataInputStream input) throws IOException {
        return iand.INSTANCE;
    }
}