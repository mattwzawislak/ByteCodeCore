package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.l2d;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class l2dReader implements Reader<l2d> {

    @Override
    public l2d read(final IndexedDataInputStream input) throws IOException {
        return new l2d();
    }
}