package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDCmpG;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dcmpgReader implements Reader<DefaultDCmpG> {

    @Override
    public DefaultDCmpG read(final ByteCodeReader input) throws IOException {
        return DefaultDCmpG.INSTANCE;
    }
}