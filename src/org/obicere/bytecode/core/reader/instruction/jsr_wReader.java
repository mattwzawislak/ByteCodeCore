package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.jsr_w;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class jsr_wReader implements Reader<jsr_w> {

    @Override
    public jsr_w read(final IndexedDataInputStream input) throws IOException {
        final int index = input.getIndex() - 1;
        return new jsr_w(input.readWideLabel(index));
    }
}