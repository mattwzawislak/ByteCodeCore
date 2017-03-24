package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DStore_1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDStore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DStore_1Reader implements Reader<DStore_1> {

    @Override
    public DStore_1 read(final ByteCodeReader input) throws IOException {
        return DefaultDStore_1.INSTANCE;
    }
}