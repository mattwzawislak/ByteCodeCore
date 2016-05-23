package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.if_icmplt;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_icmpltReader implements Reader<if_icmplt> {

    @Override
    public if_icmplt read(final IndexedDataInputStream input) throws IOException {
        final int index = input.getIndex() - 1;
        return new if_icmplt(input.readLabel(index));
    }
}