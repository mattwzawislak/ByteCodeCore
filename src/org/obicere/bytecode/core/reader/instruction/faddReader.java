package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fadd;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class faddReader implements Reader<fadd> {

    @Override
    public fadd read(final IndexedDataInputStream input) throws IOException {
        return fadd.INSTANCE;
    }
}