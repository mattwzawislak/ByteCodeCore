package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ldc2_w;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ldc2_wReader implements Reader<ldc2_w> {

    @Override
    public ldc2_w read(final IndexedDataInputStream input) throws IOException {
        return new ldc2_w(input.readUnsignedByte(), input.readUnsignedByte());
    }
}