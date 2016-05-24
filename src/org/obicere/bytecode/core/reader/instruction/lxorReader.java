package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lxor;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lxorReader implements Reader<lxor> {

    @Override
    public lxor read(final IndexedDataInputStream input) throws IOException {
        return lxor.INSTANCE;
    }
}