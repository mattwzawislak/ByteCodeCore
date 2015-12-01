package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.multianewarray;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class multianewarrayReader implements Reader<multianewarray> {

    @Override
    public multianewarray read(final IndexedDataInputStream input) throws IOException {
        return new multianewarray(input.readUnsignedByte(), input.readUnsignedByte(), input.readUnsignedByte());
    }
}