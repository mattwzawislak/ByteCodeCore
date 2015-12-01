package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ldc_w;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ldc_wReader implements Reader<ldc_w> {

    @Override
    public ldc_w read(final IndexedDataInputStream input) throws IOException {
        return new ldc_w(input.readUnsignedByte(), input.readUnsignedByte());
    }
}