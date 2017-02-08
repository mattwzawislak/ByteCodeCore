package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultINeg;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class inegReader implements Reader<DefaultINeg> {

    @Override
    public DefaultINeg read(final ByteCodeReader input) throws IOException {
        return DefaultINeg.INSTANCE;
    }
}