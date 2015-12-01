package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iload_3;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iload_3Reader implements Reader<iload_3> {

    @Override
    public iload_3 read(final IndexedDataInputStream input) throws IOException {
        return new iload_3();
    }
}