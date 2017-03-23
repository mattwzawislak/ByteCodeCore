package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.ArrayLength;
import org.obicere.bytecode.core.objects.code.instruction.DefaultArrayLength;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ArrayLengthReader implements Reader<ArrayLength> {

    @Override
    public ArrayLength read(final ByteCodeReader input) throws IOException {
        return DefaultArrayLength.INSTANCE;
    }
}
