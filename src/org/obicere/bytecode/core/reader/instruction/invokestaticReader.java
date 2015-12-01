package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.invokestatic;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokestaticReader implements Reader<invokestatic> {

    @Override
    public invokestatic read(final IndexedDataInputStream input) throws IOException {
        return new invokestatic(input.readUnsignedByte(), input.readUnsignedByte());
    }
}