package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultILoad_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iload_0Reader implements Reader<DefaultILoad_0> {

    @Override
    public DefaultILoad_0 read(final ByteCodeReader input) throws IOException {
        return DefaultILoad_0.INSTANCE;
    }
}