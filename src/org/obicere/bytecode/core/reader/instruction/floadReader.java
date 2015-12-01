package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fload;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class floadReader implements Reader<fload> {

    @Override
    public fload read(final IndexedDataInputStream input) throws IOException {
       return new fload(input.readUnsignedByte());
    }
}