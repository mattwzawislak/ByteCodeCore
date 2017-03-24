package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DStore_2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDStore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DStore_2Reader implements Reader<DStore_2> {

    @Override
    public DStore_2 read(final ByteCodeReader input) throws IOException {
        return DefaultDStore_2.INSTANCE;
    }
}