package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantUtf8;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantUtf8Reader implements Reader<ConstantUtf8>{
    @Override
    public ConstantUtf8 read(final IndexedDataInputStream input) throws IOException {
        return new ConstantUtf8(input.readUTF());
    }
}
