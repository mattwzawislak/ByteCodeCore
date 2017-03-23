package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DStore_3;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDStore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DStore_3Reader implements Reader<DStore_3> {

    @Override
    public DStore_3 read(final ByteCodeReader input) throws IOException {
        return DefaultDStore_3.INSTANCE;
    }
}