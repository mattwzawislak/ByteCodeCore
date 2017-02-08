package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFCmpL;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fcmplReader implements Reader<DefaultFCmpL> {

    @Override
    public DefaultFCmpL read(final ByteCodeReader input) throws IOException {
        return DefaultFCmpL.INSTANCE;
    }
}