package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIMul;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class imulReader implements Reader<DefaultIMul> {

    @Override
    public DefaultIMul read(final ByteCodeReader input) throws IOException {
        return DefaultIMul.INSTANCE;
    }
}