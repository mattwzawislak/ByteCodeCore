package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultBAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class bastoreReader implements Reader<DefaultBAStore> {

    @Override
    public DefaultBAStore read(final ByteCodeReader input) throws IOException {
        return DefaultBAStore.INSTANCE;
    }
}
