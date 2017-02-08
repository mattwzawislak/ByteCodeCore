package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultAThrow;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class athrowReader implements Reader<DefaultAThrow> {

    @Override
    public DefaultAThrow read(final ByteCodeReader input) throws IOException {
        return DefaultAThrow.INSTANCE;
    }
}
