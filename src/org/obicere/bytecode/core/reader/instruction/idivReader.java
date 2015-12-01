package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.idiv;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class idivReader implements Reader<idiv> {

    @Override
    public idiv read(final IndexedDataInputStream input) throws IOException {
        return new idiv();
    }
}