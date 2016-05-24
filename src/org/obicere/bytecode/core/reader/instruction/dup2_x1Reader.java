package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dup2_x1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dup2_x1Reader implements Reader<dup2_x1> {

    @Override
    public dup2_x1 read(final IndexedDataInputStream input) throws IOException {
        return dup2_x1.INSTANCE;
    }
}