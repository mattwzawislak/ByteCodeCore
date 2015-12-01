package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.goto_;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class gotoReader implements Reader<goto_> {

    @Override
    public goto_ read(final IndexedDataInputStream input) throws IOException {
        return new goto_(input.readUnsignedByte(), input.readUnsignedByte());
    }
}