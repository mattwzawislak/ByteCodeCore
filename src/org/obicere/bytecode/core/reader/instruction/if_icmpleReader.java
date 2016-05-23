package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.if_icmple;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_icmpleReader implements Reader<if_icmple> {

    @Override
    public if_icmple read(final IndexedDataInputStream input) throws IOException {
        final int index = input.getIndex() - 1;
        return new if_icmple(input.readLabel(index));
    }
}