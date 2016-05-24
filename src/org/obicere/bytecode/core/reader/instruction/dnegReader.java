package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dneg;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dnegReader implements Reader<dneg> {

    @Override
    public dneg read(final IndexedDataInputStream input) throws IOException {
        return dneg.INSTANCE;
    }
}