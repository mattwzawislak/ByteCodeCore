package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDRem;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dremReader implements Reader<DefaultDRem> {

    @Override
    public DefaultDRem read(final ByteCodeReader input) throws IOException {
        return DefaultDRem.INSTANCE;
    }
}