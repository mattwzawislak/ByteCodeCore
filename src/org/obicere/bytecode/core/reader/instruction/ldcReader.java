package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ldc;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ldcReader implements Reader<ldc> {

    @Override
    public ldc read(final IndexedDataInputStream input) throws IOException {
        return new ldc(input.readUnsignedByte());
    }
}