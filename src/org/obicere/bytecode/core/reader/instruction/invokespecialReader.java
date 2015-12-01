package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.invokespecial;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokespecialReader implements Reader<invokespecial> {

    @Override
    public invokespecial read(final IndexedDataInputStream input) throws IOException {
        return new invokespecial(input.readUnsignedByte(), input.readUnsignedByte());
    }
}