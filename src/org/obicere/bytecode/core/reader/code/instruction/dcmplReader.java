package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDCmpL;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dcmplReader implements Reader<DefaultDCmpL> {

    @Override
    public DefaultDCmpL read(final ByteCodeReader input) throws IOException {
        return DefaultDCmpL.INSTANCE;
    }
}