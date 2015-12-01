package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.getstatic;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class getstaticReader implements Reader<getstatic> {

    @Override
    public getstatic read(final IndexedDataInputStream input) throws IOException {
        return new getstatic(input.readUnsignedByte(), input.readUnsignedByte());
    }
}