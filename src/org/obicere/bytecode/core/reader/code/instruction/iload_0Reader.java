package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iload_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iload_0Reader implements Reader<iload_0> {

    @Override
    public iload_0 read(final ByteCodeReader input) throws IOException {
        return iload_0.INSTANCE;
    }
}