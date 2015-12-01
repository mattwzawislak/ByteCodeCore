package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.new_;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class newReader implements Reader<new_> {

    @Override
    public new_ read(final IndexedDataInputStream input) throws IOException {
        return new new_(input.readUnsignedByte(), input.readUnsignedByte());
    }
}