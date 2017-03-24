package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DStore_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDStore_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DStore_0Reader implements Reader<DStore_0> {

    @Override
    public DStore_0 read(final ByteCodeReader input) throws IOException {
        return DefaultDStore_0.INSTANCE;
    }
}