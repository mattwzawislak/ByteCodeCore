package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fdiv;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fdivReader implements Reader<fdiv> {

    @Override
    public fdiv read(final IndexedDataInputStream input) throws IOException {
        return new fdiv();
    }
}