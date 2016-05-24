package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fneg;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fnegReader implements Reader<fneg> {

    @Override
    public fneg read(final IndexedDataInputStream input) throws IOException {
        return fneg.INSTANCE;
    }
}