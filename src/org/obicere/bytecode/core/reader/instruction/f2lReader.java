package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.f2l;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class f2lReader implements Reader<f2l> {

    @Override
    public f2l read(final IndexedDataInputStream input) throws IOException {
        return new f2l();
    }
}