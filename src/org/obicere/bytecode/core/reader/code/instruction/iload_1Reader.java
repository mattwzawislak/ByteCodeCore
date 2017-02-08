package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultILoad_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iload_1Reader implements Reader<DefaultILoad_1> {

    @Override
    public DefaultILoad_1 read(final ByteCodeReader input) throws IOException {
        return DefaultILoad_1.INSTANCE;
    }
}