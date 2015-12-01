package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.aload_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aload_0Reader implements Reader<aload_0> {

    @Override
    public aload_0 read(final IndexedDataInputStream input) throws IOException {
        return new aload_0();
    }
}
