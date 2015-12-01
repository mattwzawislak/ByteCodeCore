package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.return_;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class returnReader implements Reader<return_> {

    @Override
    public return_ read(final IndexedDataInputStream input) throws IOException {
        return new return_();
    }
}