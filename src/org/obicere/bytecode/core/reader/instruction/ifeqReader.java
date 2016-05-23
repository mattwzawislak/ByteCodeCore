package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ifeq;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifeqReader implements Reader<ifeq> {

    @Override
    public ifeq read(final IndexedDataInputStream input) throws IOException {
        final int index = input.getIndex() - 1;
        return new ifeq(input.readLabel(index));
    }
}