package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.aload_3;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aload_3Reader implements Reader<aload_3> {

    @Override
    public aload_3 read(final IndexedDataInputStream input) throws IOException {
        return new aload_3();
    }
}