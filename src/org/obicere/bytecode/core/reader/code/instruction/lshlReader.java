package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLShL;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lshlReader implements Reader<DefaultLShL> {

    @Override
    public DefaultLShL read(final ByteCodeReader input) throws IOException {
        return DefaultLShL.INSTANCE;
    }
}