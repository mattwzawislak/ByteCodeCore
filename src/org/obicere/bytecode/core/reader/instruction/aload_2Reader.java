package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.aload_2;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aload_2Reader implements Reader<aload_2> {

    @Override
    public aload_2 read(final IndexedDataInputStream input) throws IOException {
        return aload_2.INSTANCE;
    }
}