package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.f2d;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class f2dReader implements Reader<f2d> {

    @Override
    public f2d read(final IndexedDataInputStream input) throws IOException {
        return new f2d();
    }
}