package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.invokedynamic;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokedynamicReader implements Reader<invokedynamic> {

    @Override
    public invokedynamic read(final IndexedDataInputStream input) throws IOException {
        return new invokedynamic(input.readUnsignedByte(), input.readUnsignedByte(), input.readUnsignedByte(), input.readUnsignedByte());
    }
}