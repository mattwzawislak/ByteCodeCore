package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.anewarray;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class anewarrayReader implements Reader<anewarray> {

    @Override
    public anewarray read(final IndexedDataInputStream input) throws IOException {
        return new anewarray(input.readUnsignedByte(), input.readUnsignedByte());
    }
}
