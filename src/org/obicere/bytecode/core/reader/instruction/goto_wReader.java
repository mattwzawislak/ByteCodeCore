package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.goto_w;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class goto_wReader implements Reader<goto_w> {

    @Override
    public goto_w read(final IndexedDataInputStream input) throws IOException {
        final int index = input.getIndex() - 1;
        return new goto_w(input.readWideLabel(index));
    }
}