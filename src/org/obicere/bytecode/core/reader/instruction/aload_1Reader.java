package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.aload_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aload_1Reader implements Reader<aload_1> {

    @Override
    public aload_1 read(final IndexedDataInputStream input) throws IOException {
        return aload_1.INSTANCE;
    }
}