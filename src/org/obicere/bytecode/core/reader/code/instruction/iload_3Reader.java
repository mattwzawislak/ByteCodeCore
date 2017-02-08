package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultILoad_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iload_3Reader implements Reader<DefaultILoad_3> {

    @Override
    public DefaultILoad_3 read(final ByteCodeReader input) throws IOException {
        return DefaultILoad_3.INSTANCE;
    }
}