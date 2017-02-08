package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultILoad_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iload_2Reader implements Reader<DefaultILoad_2> {

    @Override
    public DefaultILoad_2 read(final ByteCodeReader input) throws IOException {
        return DefaultILoad_2.INSTANCE;
    }
}