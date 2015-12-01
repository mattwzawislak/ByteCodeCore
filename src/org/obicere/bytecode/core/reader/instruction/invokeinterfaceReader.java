package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.invokeinterface;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokeinterfaceReader implements Reader<invokeinterface> {

    @Override
    public invokeinterface read(final IndexedDataInputStream input) throws IOException {
        return new invokeinterface(input.readUnsignedByte(), input.readUnsignedByte(), input.readUnsignedByte(), input.readUnsignedByte());
    }
}