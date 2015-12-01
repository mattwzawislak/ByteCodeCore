package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dmul;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dmulReader implements Reader<dmul> {

    @Override
    public dmul read(final IndexedDataInputStream input) throws IOException {
        return new dmul();
    }
}