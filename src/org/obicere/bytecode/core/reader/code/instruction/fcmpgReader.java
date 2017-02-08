package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFCmpG;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fcmpgReader implements Reader<DefaultFCmpG> {

    @Override
    public DefaultFCmpG read(final ByteCodeReader input) throws IOException {
        return DefaultFCmpG.INSTANCE;
    }
}